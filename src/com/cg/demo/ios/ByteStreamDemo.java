package com.cg.demo.ios;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("Start");
		
		FileInputStream fis = new FileInputStream("sample.txt");
		
		while (fis.available() > 0) {
			System.out.println((char)fis.read());
		}
		System.out.println("\nEnd");
		fis.close();
			
		}
		
		
	}

