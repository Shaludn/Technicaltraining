package week2.interfaces;

public interface Animal {
	/*interface methods are completely abstract and 
	 * cannot have a body of the method.
	 * They are implemented in tthe respective child classes
	 * Therefore, interfaces exhibit 100% abstraction.
	 */
	void run();
	void sound();
}
class cat implements Animal{
	@Override
	public void sound() {
		System.out.println("Meowww");
		
	}
	
	@Override
	public void run() {
		System.out.println("Cats run fast");
		
	}
}

class dog implements Animal{
	@Override
	public void sound() {
		System.out.println("bowww");
	}
	
	@Override
	public void run() {
		System.out.println(" Dogs run fast");
	}
	
}
class demo{
	public static void main(String[] args) {
		cat c=new cat();
		dog d=new dog();
		c.sound();
		c.run();
		d.sound();
		d.run();
	}
}