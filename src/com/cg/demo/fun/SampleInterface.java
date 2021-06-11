package com.cg.demo.fun;

public abstract  class SampleInterface {
	public abstract void anAbstractMethod();

	public abstract void anotherAbstractMethod();

	public static void aStaticMethod() {
		System.out.println("aStaticMethod");
	}

	public static void anotherStaticMethod() {
		System.out.println("anotherStaticMethod");
	}

//	public default void aDefaultMethod() {
//		System.out.println("aDefaultMethod");
//	}
//
//	public default void anotherDefaultMethod() {
//		System.out.println("anotherDefaultMethod");
//	}

}
