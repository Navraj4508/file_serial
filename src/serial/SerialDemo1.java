package serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		d.i = 888;
		d.j = 999;
		
		
		FileOutputStream fos = new FileOutputStream("D:\\File\\abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis =  new FileInputStream("D:\\File\\abc.ser");
		ObjectInputStream ois =  new ObjectInputStream(fis);
		Dog d1 = (Dog)ois.readObject();
		
		System.out.println(d1.i+"-----"+d1.j);

	}

}
