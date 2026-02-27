package week2.Exception;

public class ThrowableDemo {
	static void test() throws Throwable{
		throw new Throwable("Something went wrong");
	}
	public static void main(String[] args) {
		try {
			test();
		}
		catch(Throwable t) {
			//Fully qualified classname + message
			System.out.println("Handled: "+ t);
			//only message
			System.out.println("Handled: "+ t.getMessage());
		}
	}

}
/*
throw new String("Error"); not possble, because String does not belong to Exception 
throw new Integer("Error"); not possible ''''
throw new Throwable("Error"); possible
throw new IOException("Error"):
*/
