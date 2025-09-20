package serial;

import java.io.Serializable;

public class Animal implements Serializable {
	
	int i = 10;
	Animal(){
		System.out.println("Animal constructor");
	}

}
