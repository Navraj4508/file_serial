package file_seer.req;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ex1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// Write a program to perform File merge (Combine ) operation .
		/*
		 * file1.txt + file2.txt = file3.txt
		 */
		
		
		/*
		PrintWriter pw =  new PrintWriter("D:\\File\\d.txt");
		BufferedReader br = new BufferedReader(new FileReader("D:\\File\\abc.txt"));
		
		
		String line = br.readLine();
		while(line != null) {
			pw.println(line);
			line = br.readLine();
		}
		
		
		br = new BufferedReader(new FileReader("D:\\File\\c.txt"));
		
		line = br.readLine();
		while(line != null) {
			pw.println(line);
			line = br.readLine();
		}
		
		pw.flush();
		br.close();
		pw.close();
		
		*/
		
		PrintWriter pw =  new PrintWriter("D:\\File\\e.txt");
		BufferedReader br = new BufferedReader(new FileReader("D:\\File\\abc.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("D:\\File\\c.txt"));
		
		String line1 = br.readLine();
		String line2 = br2.readLine();
		
		
		while(line1 != null || line2 != null) {
			if(line1 != null) {
				pw.println(line1);
				line1 = br.readLine();
			}
			if(line2 != null) {
				pw.println(line2);
				line2 = br2.readLine();
			}
			
		}
		
		pw.flush();
		br.close();
		pw.close();

	}

}
