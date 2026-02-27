package week2.garbagecollection;
//Java doesnt have destructor.

public class Test {
	@Deprecated
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Object destroyed!!");
	}
	public static void main(String[] args) {
		Test t=new Test();
		t=null;
		System.gc();
	}

}
