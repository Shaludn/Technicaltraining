package week2.Exception;
import java.io.*;

public class E4 {
	public static void main(String[] args) throws IOException {
		//BufferedReader br=null; // it should always initialized to null.
		String s;
		
		/*try {
			br=new BufferedReader(new InputStreamReader(System.in));//BuferedReadercan read keyboard inputs aswell..
			System.out.println("Enter any data:");
			s=br.readLine();
			System.out.println(s);
		}*/
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Enter any data:");
			s=br.readLine();
			System.out.println(s);
			//br.close(), not needed- closes Automatically by Autocloseable.
		}
	}

}
