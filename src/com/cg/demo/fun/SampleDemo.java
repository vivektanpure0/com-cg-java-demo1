package com.cg.demo.fun;

public class SampleDemo {
	

		public static void main(String[] args) {

			SampleInterface obj = new SampleInterface() {

				@Override
				public void anAbstractMethod() {
					System.out.println("anAbstractMethod");
				}

				@Override
				public void anotherAbstractMethod() {
					System.out.println("anotherAbstractMethod");
				}
			};
			obj.anAbstractMethod();
			obj.anotherAbstractMethod();
//			obj.aDefaultMethod();
//			obj.anotherDefaultMethod();
			SampleInterface.aStaticMethod();
			SampleInterface.anotherStaticMethod();

		}

}
