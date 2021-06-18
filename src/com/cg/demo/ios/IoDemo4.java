package com.cg.demo.ios;

import java.io.*;

	public class IoDemo4 {
	// create a file

		public static void main(String[] args) {
			try {

				File file = new File("E:\\testFile1.txt");
				boolean fileCheck = file.createNewFile();
				if (fileCheck == true) {
					System.out.println("file created ");
				} else {
					System.out.println("File already present");
				}

			} catch (IOException e) {
				System.out.println("Something is wrong.");
			}

	}

}
