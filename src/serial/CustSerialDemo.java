package serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustSerialDemo {

	public static void main(String[] args) throws Exception {
		
		Account a = new Account();
		System.out.println(a.userName +"----"+a.pwd);
		FileOutputStream fos = new FileOutputStream("D:\\File\\abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(a);
		
		FileInputStream fis = new FileInputStream("D:\\File\\abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a1 = (Account)ois.readObject();
		System.out.println(a1.userName +"----"+a1.pwd);

	}

}
