package com.cg.demo.fun;

public class LambdaDemo {
	public static void main(String[] args) {

		Int obj = ()-> {
			System.out.println("absMethod ");
		};

//		MyInt obj = (int i) -> System.out.println("absMethod " + i);

		obj.absMethod();
//		obj.absMethod(10);

	}
}
