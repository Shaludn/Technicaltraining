package week2.Exception;

public class E1 {
	public static void main(String[] args) {
		int i, j, k=0;
	    i=10;
		j=10;
		try {
			k=i/j;// try block includes logical function
			int[] arr= {1,3,3,4,5};
			System.out.println(arr[9]);//when there's already one exception present, the code will stop at first exception, it wont move
			                           //to other exceptions.
		}
		catch(ArithmeticException e) {        // catch blocks catches the exception and prints the problem occured
			System.out.println("Cnnot divide by zero");
			e.printStackTrace();//prints the detail about the exception, not for frontend.
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bound");
		}
		catch(Exception e) {
			System.out.println("Something's fishy!!!");
		}
		finally {
			System.out.println("End of execution");
			System.out.println("Turn of BD");
			System.out.println("Turn off Internet");
			System.out.println("Turn off files");
		}
		System.out.println(k);
		
	}
	static {
		System.out.println("Start Exceution");
		System.out.println("Load DB");
		System.out.println("Load Internet");
		System.out.println("Load files"); // static block is always executed first...
	}
}
