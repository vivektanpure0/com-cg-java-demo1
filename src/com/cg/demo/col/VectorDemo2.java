package com.cg.demo.col;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		Vector v = new Vector(3,2);
		
		System.out.println(v.capacity());
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println(v.capacity());
		
		Enumeration e = v.elements();
		System.out.println("Vector elements are : ");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		
		
	}
}
