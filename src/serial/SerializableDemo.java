package serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		Cat c = new Cat();
		System.out.println("Start");
		FileOutputStream fos = new FileOutputStream("D:\\File\\abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(c);
		oos.writeObject(d);
		System.out.println("End");
		
		System.out.println("De Start");
		FileInputStream fis = new FileInputStream("D:\\File\\abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
//		Cat c1 = (Cat)ois.readObject();
		Dog d1 = (Dog)ois.readObject();
		
		/*
		Exception in thread "main" java.lang.ClassCastException: class serial.Cat cannot be cast to class serial.Dog (serial.Cat and serial.Dog are in unnamed module of loader 'app')
		at serial.SerializableDemo.main(SerializableDemo.java:26)
*/
		
		
		System.out.println("End");
		
		
//		System.out.println(d1.i + " ----"+ d1.j);
//		System.out.println(c1.i + " ----"+ c1.j);

	}

}


/*
 * Exception in thread "main" java.io.NotSerializableException: serial.Dog
	at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1200)
	at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:358)
	at serial.SerializableDemo.main(SerializableDemo.java:17)

 */
