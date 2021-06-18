package com.cg.demo.ios;

import java.io.FileInputStream; 
import java.io.ObjectInputStream;
import java.io.IOException;

	public class SerDemo2 {
		public static void main(String args[]) throws IOException, ClassNotFoundException {
			
			Employee obj1 = null;
			FileInputStream fis = new FileInputStream("emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj1 = (Employee) ois.readObject();
			ois.close();
			fis.close(); 
			System.out.println(obj1.id);
			System.out.println(obj1.name);
			System.out.println(obj1.salary);
//			System.out.println(obj1.phone);

		}
		
	}
