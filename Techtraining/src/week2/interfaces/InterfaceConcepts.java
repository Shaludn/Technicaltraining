package week2.interfaces;

interface InterfaceConcepts {
	void display();

}
class B{
	public static void main(String[] args) {
		B b=new B();
		//Old java Code
		InterfaceConcepts o=new InterfaceConcepts() {
			public void display() {
				System.out.println("Hello");
			}
		};
		//java 8 or 1.8 (lambda) Scala inspired java code
		InterfaceConcepts o1=() ->System.out.println("Hello");
	}
}
