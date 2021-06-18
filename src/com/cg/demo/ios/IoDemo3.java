package com.cg.demo.ios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


	public class IoDemo3 {
	// read and write to a file using data streams

		public static void main(String[] args) throws IOException {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("F:\\sample.txt"));
			DataInputStream dis = new DataInputStream(new FileInputStream("F:\\sample.txt"));

			dos.writeInt(1234);

			int i = dis.readInt();

			System.out.println(i);
			dos.close();
			dis.close();
		}
		
	}
