package com.cg.demo.ios;
import java.io.FileWriter;

	public class IoDemo2 {
	//write data to file using FileWriter

		public static void main(String args[]) {
			try {
				FileWriter fw = new FileWriter("F:\\test.txt"); 
				fw.write("sample text 2");
				fw.close();
			} catch (Exception e) {
				System.out.println(e);

			} 
			System.out.println("done");

		}

}
