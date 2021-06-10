package com.cg.demo.col;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer> ();
		s1.push (125);
		s1.push (400);
		s1.push (789);
		
		System.out.println("Top element of Stack is:" + s1.peek());
		System.out.println("Element removed from Stack is:" + s1.pop());
		System.out.println("Stack elements after removal:" + s1);
		
		System.out.println("Check for element '56' in stack: "+ s1.search(56));
		
		
		
		

	}

}
