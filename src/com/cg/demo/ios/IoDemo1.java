package com.cg.demo.ios;
import java.io.*;

	

	// write to a file using FileOutputStream 
	public class IoDemo1 {
		public static void main(String[] args) throws IOException {
			

		String str = "file text";
		FileOutputStream fos = null;

		try {

			fos = new FileOutputStream("F:/testFile.txt"); 
			byte[] bytesArray = str.getBytes();
			fos.write(bytesArray);
			System.out.println("text written to file");

		} catch (IOException ioe) { 
			System.out.println("Something went wrong.");

		} finally {
			if (fos != null) {
				fos.close();

			}

		}

	

	}

}
