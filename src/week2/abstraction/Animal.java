package week2.abstraction;

abstract class Animal {
	/*there are two types of methods:
	 * Normal method
	 * Abstract Method
	 */
	void eat() {
		System.out.println("Animals eat some food");	}
	
	
	//Abstract methods cannot have a body
	//It will be implemented in the child classes
	abstract void run();
	//If an abstract class has only abstract methods
	//it is 100% abstraction
	//even it it has even 1 normal abstract method-it is not 100%

}

class cat extends Animal{
	@Override
	void run() {
		System.out.println("Cats run fast");
	}
}
class cheetah extends Animal{
	@Override
	void run() {
		System.out.println("Cheetah runs very fast");
	}
}

class Demo{
	public static void main(String[] args) {
		cat c=new cat();
		cheetah ch=new cheetah();
		c.eat();
		c.run();
		ch.eat();
		ch.run();
	}
}