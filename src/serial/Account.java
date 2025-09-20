package serial;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
	
	String userName = "Navraj";
	transient String pwd = "king";
	
	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
		String epwd = "123"+pwd;
		oos.writeObject(epwd);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception, IOException {
		ois.defaultReadObject();
		
		String epwd= (String)ois.readObject();
		pwd = epwd.substring(3);
	}

}
