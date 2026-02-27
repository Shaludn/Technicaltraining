package week2.interfaces;
//Multiple inheritance.....
//in the latest java version, we are able todefine body of a method in the interfaces.
interface Cat {
	default void sound() {
		System.out.println("Cat makes meoww");
	}

}

interface Dog{
	default void sound() {
		System.out.println("woof");
	}
}

class Cog implements Cat,Dog{

	@Override
	public void sound() {
		Cat.super.sound();
	}
	//System.out.println("some sound!!")
	//cat.super.sound();
	}

class DEMO1{
	public static void main(String[] args) {
		Cog c=new Cog();
		c.sound();
	}
		
	}

