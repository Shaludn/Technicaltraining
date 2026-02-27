package week2.Exception;

import java.io.IOException;
//java.io.IOException-> fully qualified classname.

//throws keyword is always written in method signature place, and
//throws keyword, throws a exception, and a try catch block should be used to handle it.
//thrwos keyword passes the info to the calling method
//the calling method has to handle the exception using try-catch block.
//for checked exception we always use try-catch block.
public class CheckedException {
	static void readFile() throws IOException{ 
		throw new IOException("File not found");
		
	}
	public static void main(String[] args) {
		try {
			display();
		}catch(IOException e) {
			System.out.println(e.getMessage()); //.getMessage() only sends the message, doesnot includes className.
		}
		
	}
	static void display()throws IOException {
		readFile();
	}

}
