package com.cg.demo.misc;
import java.util.function.Consumer;
import java.util.ArrayList;

public class LambdaExp2 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(8);
		numbers.add(9);
		numbers.add(2);
		
		 Consumer<Integer> method = (n) -> { System.out.println(n); };
		    numbers.forEach( method );
		
		
		
	}

}
