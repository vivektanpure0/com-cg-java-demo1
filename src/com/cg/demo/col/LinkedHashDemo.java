package com.cg.demo.col;
import java.util.LinkedHashSet;

public class LinkedHashDemo {

public static void main(String[] args) {
	LinkedHashSet<String> lhs1 = new LinkedHashSet<String>();
	
	//Add elements to LHS
	lhs1.add("A");
	lhs1.add("B");
	lhs1.add("C");
	lhs1.add("D");
	lhs1.add("E");
	lhs1.add("F");
	
	System.out.println(lhs1);
	
	//LHS in Integer type
	LinkedHashSet<Integer> lhs2 = new LinkedHashSet<Integer>();
	lhs2.add(10);
	lhs2.add(20);
	lhs2.add(30);
	lhs2.add(40);
	lhs2.add(50);
	lhs2.add(60);
	
	System.out.println(lhs2);
	
	
	
	
	
}
}
