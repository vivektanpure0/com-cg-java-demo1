package com.cg.demo.ex;
import java.util.Scanner;

public class ArithmeticException1 {

	
	   public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter first number: ");
	      int a = sc.nextInt();
	      System.out.println("Enter second number: ");
	      int b = sc.nextInt();
	      int c = a/b;
	      sc.close();
	      System.out.println("The result is: "+c);
	   }

	public void printStackTrace() {
		// TODO Auto-generated method stub
		
	}
	}

