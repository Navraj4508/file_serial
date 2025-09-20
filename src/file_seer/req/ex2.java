package file_seer.req;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class ex2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		// Write a program to merge data from all files present in a folder into a new file. 
		
		PrintWriter pw = new PrintWriter("D:\\File\\f.txt");
		File f = new File("D:\\File\\P2");
		
		String[] s = f.list();
		for(String s1 : s) {
			File f1 = new File(f, s1);

			//BufferedReader br = new BufferedReader(new FileReader(f1));
			String line = br.readLine();
			
			while(line != null) {
				pw.println(line);
				line = br.readLine();
				
			}
		}
		pw.flush();

	}

}
