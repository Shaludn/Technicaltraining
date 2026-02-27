package week2.Exception;
import java.io.*;

public class Demo {
	public static void main(String[] args) {
		try {
			int bal=2000;
			int withdraw=3000;
			
			if(withdraw>bal) {
				throw new RuntimeException("Insufficient Funds");
			}
			System.out.println("Withdrawal Succesful");
		} catch(RuntimeException e) {
			System.out.println("CAUGHT EXCEPTION:" + e.getMessage());
		}
	}

}
