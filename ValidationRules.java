package Utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.Patient;

import ExceptionHandling.PatientHandlingException;

public class ValidationRules {
	
	
	public static Patient validateAll(int sn,String pn,int age,String gender,String address,String PhoneNumber,
			String disease,String addate,double aninc,String rt,ArrayList<Patient> patientlist) throws PatientHandlingException
	{
		checkforduplicate(patientlist,sn);
		LocalDate vaddate=parseandvalidatedate(addate);
		roomType vrt=parsert(rt);
		return new Patient(sn,pn,age,gender,address,PhoneNumber,disease,vaddate,aninc,vrt);
	}

	public static roomType parsert(String rt) {
		return roomType.valueOf(rt.toUpperCase());
	}

	private static LocalDate parseandvalidatedate(String addate) throws PatientHandlingException {
			
		LocalDate vdate=LocalDate.parse(addate);
		if(!vdate.equals(LocalDate.now()))
			throw new PatientHandlingException("Admission date must be today");
		return vdate;
	}

	private static void checkforduplicate(ArrayList<Patient> patientlist, int sn) throws PatientHandlingException {
		
		
		for(Patient p:patientlist)
		{
			if(p.getSerialNo()==sn)
				throw new PatientHandlingException("Duplicate patient Id");
		}
		
		
		
	}

}
