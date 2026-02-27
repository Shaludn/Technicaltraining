package Assignment1;

public class fact {
	static int fac(int n) {
		int res=1;
		if(n==0) {
			return 1;
		}
		else {
		 
		 res= n* fac(n-1);
	}
		return res;
	}
	public static void main(String[] args) {
		System.out.println("The factorial of number" + 7 + " is :" +fac(7));
	}

}
