package file_seer;

import java.io.*;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileWriter fw = new FileWriter("D:\\File\\c.txt");
		PrintWriter pw = new PrintWriter("D:\\File\\ca.txt");
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println('c');
		pw.println("Navraj Kumar");
		pw.flush();
		pw.close();
		

	}

}
