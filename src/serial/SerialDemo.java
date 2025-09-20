package serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {
	
	public static void main(String[] args) throws Exception {
		
		Dog d = new Dog();
		FileOutputStream fos = new FileOutputStream("D:\\File\\abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(d);
		
		FileInputStream fis = new FileInputStream("D:\\File\\abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog)ois.readObject();
//		System.out.println(d1.c.r.i);
		
	}

}
