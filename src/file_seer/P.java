package file_seer;

import java.io.File;

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\File\\P1");
		String[]  s = f.list();
		
		for(String s1 : s ) {
			File f1 = new File(f,s1);
			if(f1.isDirectory()) {
				System.out.println(s1);
			}
		}
		System.out.println("Hello Got Hub");

	}

} 
