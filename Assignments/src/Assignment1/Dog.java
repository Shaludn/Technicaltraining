package Assignment1;

class Animal{
	void  display() {
		System.out.println("Animal makes different sounds");
	}
}

public class Dog extends Animal {
	void sound() {
		System.out.println("Dog sounds bow, bow!!!!");
	}

	public static void main(String[] args) {
		Dog d=new Dog();
		d.display();
		d.sound();
		

	}

	public void print() {
		// TODO Auto-generated method stub
		
	}

}
