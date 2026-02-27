package week2.composition;
//tight coupling

class engine{
	void start() {
		System.out.println("Engine starts!!");
	}
}
public class car {
	private engine eng;
	car(){
		eng=new engine();
	}
	void drive() {
		eng.start();//a object of other class is called in to thss class, tight coupling.
		System.out.println("Car is moving");
	}
	
	public static void main(String[] args) {
		car c=new car();
		c.drive();
	}

}
