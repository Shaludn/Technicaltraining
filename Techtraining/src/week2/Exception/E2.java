package week2.Exception;

public class E2 {
	public static void main(String[] args) {
		int i=10,j=0, k=0;
		try {
			k=i/j;
			int[] arr= {1,2,3,4,5};
			System.out.println(arr[9]);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) { //Multi catch block, one block with multiple exception.
			System.out.println("ERROR");
		}
		System.out.println(k);
	}

}
