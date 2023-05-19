package TestPatients;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import static Utils.PopulatePatients.populatepat;
import static Utils.ValidationRules.validateAll;
import static Utils.ValidationRules.parsert;
import static Utils.storerestore.*;
import Utils.roomType.*;

import com.app.Patient;

import ExceptionHandling.PatientHandlingException;
import Utils.gendercomparator;
import Utils.roomType;

public class PatientTester {

	public static void main(String[] args) throws PatientHandlingException, FileNotFoundException, ClassNotFoundException, IOException {
		try(Scanner sc=new Scanner(System.in))
		{
			ArrayList<Patient> Patientlist=populatepat();
			System.out.println("Enter file name");
			restoredet(sc.next());
			System.out.println("data is restored successfully");
			boolean entry=true;
			while(entry)
			{
				System.out.println("Press 1 to add patient\nPress 2 to Display all patients "
						+ "\nPress 3 to display patients of specific room type"
						+ "\nPress 4 to remove patients having Diabetese"
						+ "\nPress 5 to change Room Type of patients from 'ICU' to 'Special' romm"
						+ "\n press 6 to sort patients based on gender"
						+ "0 to exit");
				System.out.println("Enter choice");
				try
				{
					switch(sc.nextInt())
					{
					case 1:
						System.out.println("Enter  serialNo, patientName, age, gender, address, phoneNumber,\r\n"
								+ " disease, admitDate, annualincome, roomType ");
						Patient newpat=validateAll(sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.next()
								,sc.next(),sc.next(),sc.nextDouble(),sc.next(),Patientlist);
						Patientlist.add(newpat);
						System.out.println("Patient is added successfully");
						break;
					
					case 2:
						System.out.println("List of All patients");
						for(Patient p:Patientlist)
						{
							System.out.println(p);
						}
					break;
					
					case 3:
						System.out.println("Enter room type");
						roomType vrt=parsert(sc.next());
						for(Patient p:Patientlist)
						{
							if(p.getRt()==vrt)
							{
								System.out.println(p);
							}
						}
					break;
					
					case 4:
						//Patientlist.removeIf(p-> p.getDisease().contentEquals("Diabetese"));
						
//						for(Patient p:Patientlist)
//						{
//							if(p.getDisease().contentEquals("Diabetese"))
//							{
//								Patientlist.remove(p);//coc modification error
//							}
//						}
						
//						Iterator<Patient> itr=Patientlist.iterator();
//						{
//							while(itr.hasNext())
//							{
//								if(itr.next().getDisease().contentEquals("Diabetese"))
//									{
//									itr.remove();
//									}
//							}
//						}

						
						//Patientlist.removeIf(p->p.getDisease().contentEquals("Diabetese"));
						break;
						
					case 5:
//						for(Patient p:Patientlist)
//						{
//							if(p.getRt()==roomType.ICU)
//							{
//								p.setRt(roomType.SPECIAL);
//							}
//						}
						Patientlist.stream().filter(p->p.getRt()==roomType.ICU).
						forEach(p->{p.setRt(roomType.SEMISPECIAL);
						System.out.println(p);});						;
						
						break;
						
					case 6:
						Collections.sort(Patientlist, new gendercomparator());
						System.out.println("Patients are sorted");
						break;
						
					case 0:
						entry=false;
						System.out.println("Enter file name");
						storedet(sc.next(), Patientlist);
						System.out.println("data is stored successfully");
						
					break;
				}//switch
				
				}catch(Exception e)
				{
					e.printStackTrace();
					sc.nextLine();
				}
			
			}//while
		
		}//try

	}

}
