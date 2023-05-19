package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.app.Patient;

public class storerestore {
	
	
	public static void storedet(String filename,ArrayList<Patient> pat) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename)))
		{
			out.writeObject(pat);
		}
	}
	
	public static ArrayList<Patient> restoredet(String filename) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename)))
		{
//			if((ArrayList<Patient>)in.readObject()==null)
//			{
//					System.out.println("nothing right now");
//					return null;
//				}
			return (ArrayList<Patient>)in.readObject();

			
		}
				
	}

}
