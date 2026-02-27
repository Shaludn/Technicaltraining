package week2.Association;
//loose coupling

public class Patient {
	String name, disease,dateofArrival;
	int patientage;
	Information info;//Reference liya hai.
	Payment pay;
	public Patient(String name, String disease, String dateofArrival, int patientage, Information info, Payment pay) {
		super();
		this.name = name;
		this.disease = disease;
		this.dateofArrival = dateofArrival;
		this.patientage = patientage;
		this.info=info;
		this.pay=pay;
	}
	void patientDetails() {
		
		System.out.println("Name: "+ this.name );
		System.out.println("Age: "+this.patientage);
		System.out.println("Disease:"+ this.disease );
		System.out.println("Dateof Arrival:"+ this.dateofArrival);
		System.out.println("Blocknumber:" + this.info.blockno);
		System.out.println("Floorno:"+ this.info.floorno);
		System.out.println("Roomno:"+ this.info.roomno);
		System.out.println("Bedno:"+ this.info.bedno);
		
		System.out.println("registration fee:"+ this.pay.regfee);
		System.out.println("admission fee:"+this.pay.admfee);
		System.out.println("Balance amount:"+ this.pay.bal);
	}
	public static void main(String[] args) {
		Information i=new Information('c', 3,7,034);
		Payment pa=new Payment(2000, 4000, 17000);
		Patient p=new Patient("Aman", "28/02/2025", "diabetes", 23, i, pa);
		p.patientDetails();
	}
	

}
