package week2.finalkeyword;
import java.io.*;
import java.io.Serializable;
//transient example
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	String name="Shalu";
	transient String pass="12345";


}

class TransientDemo{
	public static void main(String[] args) throws Exception {
		User u=new User();
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("u.ser"));
		o.writeObject(u);//Serialization
		o.close();
		ObjectInputStream i=new ObjectInputStream(new FileInputStream("u.ser"));
		User u1=(User)i.readObject();//Deserialization
		System.out.println(u1.name);
		System.out.println(u1.pass);}
}
