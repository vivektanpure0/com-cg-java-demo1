package com.cg.demo.ios;

import java.io.*;

public class IoDemo5 {
		// delete a file
	public static void main(String[] args) {

		try { File file = new File("F:\\testFile2.txt"); 
		if (file.delete()) { 
			System.out.println(file.getName() + "deleted");

		} else {
			System.out.println("File could not be deleted.");

			}
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}

	
	}

}
