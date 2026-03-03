package Assignment1;

public class sumofeven {
	public static void main(String[] args) {
		int res=0,n=1;
		while(n>=1 && n<=100) {
			if(n%2==0) {
				System.out.print(n + "+" + " ");
				res+=n;
			}
			n++;
		
	}
		System.out.println("\n ="+ res);

}
}
