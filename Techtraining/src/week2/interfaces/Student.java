package week2.interfaces;
//Hybrid inheritance

interface sports{
	void play();
}

class person{
	String name;
	
	person(String name){
		this.name=name;
	}
}
public class Student extends person implements sports {
	Student(String name){
		super(name);//Here we call the parent class constructor.
	}
	@Override
	public void play() {
		System.out.println(name+ " play sports");
	}
	public static void main(String[] args) {
		Student s=new Student("Shalu");
		s.play();
	}

}
