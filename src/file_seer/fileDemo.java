package file_seer;

import java.io.File;
import java.io.IOException;

public class fileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count = 0;
		File f = new File("D:\\File\\P1");
		
//		f.mkdir();
		String[] s = f.list();
		for(String s1 : s) {
			File f1 = new File(f,s1);
			if(f1.isDirectory()) {
				count++;
				System.out.println(s1);
			}
			
		}
		System.out.println("total Number: "+ count);
//		File f1 = new File("D:\\File\\P3","csa.txt");
//		System.out.println(f.exists());
//		System.out.println(f.delete());
//		System.out.println(f.getPath());
		//f1.createNewFile();
		//f.mkdir();
		//System.out.println(f1.exists());

	}

}
