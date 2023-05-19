package com.app;

	import java.io.Serializable;
	import java.time.LocalDate;

	import Utils.roomType;

	public class Patient implements Serializable {

		int SerialNo;
		String PatientName;
		int age;
		String gender;
		String address;
		String PhoneNumber;
		String disease;
		LocalDate admitDate ;
		double annualincome;
		roomType rt;
		
		public Patient(int serialNo, String patientName, int age, String gender, String address, String phoneNumber,
				String disease, LocalDate admitDate, double annualincome, roomType rt) {
			super();
			SerialNo = serialNo;
			PatientName = patientName;
			this.age = age;
			this.gender = gender;
			this.address = address;
			PhoneNumber = phoneNumber;
			this.disease = disease;
			this.admitDate = admitDate;
			this.annualincome = annualincome;
			this.rt = rt;
		}

		@Override
		public String toString() {
			return "Patient [SerialNo=" + SerialNo + ", PatientName=" + PatientName + ", age=" + age + ", gender=" + gender
					+ ", address=" + address + ", PhoneNumber=" + PhoneNumber + ", disease=" + disease + ", admitDate="
					+ admitDate + ", annualincome=" + annualincome + ", rt=" + rt + "]";
		}

		public String getDisease() {
			return disease;
		}
		
		
		public boolean equals(Object o)
		{
			if(o instanceof Patient)
				return Integer.valueOf(this.SerialNo).equals(((Patient)o).SerialNo);
			return false;
		}

		public int getSerialNo() {
			return SerialNo;
		}

		public void setSerialNo(int serialNo) {
			SerialNo = serialNo;
		}

		public String getPatientName() {
			return PatientName;
		}

		public void setPatientName(String patientName) {
			PatientName = patientName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhoneNumber() {
			return PhoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			PhoneNumber = phoneNumber;
		}

		public LocalDate getAdmitDate() {
			return admitDate;
		}

		public void setAdmitDate(LocalDate admitDate) {
			this.admitDate = admitDate;
		}

		public double getAnnualincome() {
			return annualincome;
		}

		public void setAnnualincome(double annualincome) {
			this.annualincome = annualincome;
		}

		public roomType getRt() {
			return rt;
		}

		public void setRt(roomType rt) {
			this.rt = rt;
		}

		public void setDisease(String disease) {
			this.disease = disease;
		}
		
	}




