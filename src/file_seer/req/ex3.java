package file_seer.req;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class ex3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("D:\\File\\d.txt");
		BufferedReader br = new BufferedReader(new FileReader("D:\\File\\abc.txt"));
		String line = br.readLine();
		while(line != null) {
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader("D:\\File\\c.txt"));
			String target = br2.readLine();
			while(target != null) {
				if(line.equals(target)) {
					available = true;
					break;
				}
				target = br2.readLine();
			}
			if(available == false) {
				pw.println(line);
			}
			line = br.readLine();
		}
		
		pw.flush();
		br.close();
		pw.close();
		

	}

}
