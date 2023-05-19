package Utils;

import java.util.ArrayList;
import static Utils.ValidationRules.validateAll;
import com.app.Patient;

import ExceptionHandling.PatientHandlingException;

public class PopulatePatients {

	public static ArrayList<Patient> populatepat() throws PatientHandlingException
	{
		ArrayList<Patient> Patlist=new ArrayList<>();
		Patlist.add(validateAll(100,"Ram",23,"Male","Pune","1121331231",
			"Malaria","2023-05-18",23500.00,"SPECIAL",Patlist));
		Patlist.add(validateAll(102,"Geeta",25,"Feale","Nagpur","9781331231",
				"Diabetese","2023-05-18",53000.00,"SPECIAL",Patlist));
		Patlist.add(validateAll(103,"Meera",32,"Female","Nashik","4451331231",
				"Dengue","2023-05-18",78000.00,"ICU",Patlist));
		Patlist.add(validateAll(104,"Madhav",39,"Male","Pune","5561331231",
				"Diabetese","2023-05-18",98000.00,"SPECIAL",Patlist));
		
		return Patlist;
		//return null;
	}

	
	
}

