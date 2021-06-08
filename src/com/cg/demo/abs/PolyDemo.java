package com.cg.demo.abs;

public class PolyDemo {
	public int add (int i, int j) {
		return i+j;
		
	}
	public int add (int i, int j, int k) {
		return i+j+k;
		
	}
	public int add (int i, int j, int k, int l) {
		return i+j+k+l;
		
	}
	
	public int add(int i, byte j) {
		return i + j;
	}

	public int add(byte i, int j) {
		return i + j;
	}
	
	
	public static void main(String[] args) {
		
		PolyDemo polyDemo = new PolyDemo();
		System.out.println(polyDemo.add(10, 20));
		System.out.println(polyDemo.add(10, 20, 30));
		System.out.println(polyDemo.add(10, 20, 30, 40));
		byte arg1 = 10;
		int arg2 = 20;
		System.out.println(polyDemo.add(arg1, arg2));
		System.out.println(polyDemo.add(arg2, arg1));

		
			
	}
	

}
