package Utils;

	import java.util.Comparator;

	import com.app.Patient;

	public class gendercomparator implements Comparator<Patient>{

		@Override
		public int compare(Patient o1, Patient o2) {
			
			return o1.getGender().compareTo(o2.getGender());
		}
		

	}



