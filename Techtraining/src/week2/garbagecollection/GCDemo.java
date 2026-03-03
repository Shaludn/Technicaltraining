package week2.garbagecollection;

public class GCDemo {
	public static void main(String[] args) {
		GCDemo o =new GCDemo();
		o=null;
		System.gc();/*nowdays the gc method is automatically invoked after program execution
		by the object class for clutter,
		garbage collection and removal, we dont need to do .*/
		System.out.println("GC Requested!!!");
	}
}
