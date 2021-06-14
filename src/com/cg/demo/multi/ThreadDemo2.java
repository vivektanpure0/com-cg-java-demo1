package com.cg.demo.multi;


	public class ThreadDemo2 implements Runnable {

		public void printLoop() { // bookMovieTickets()
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}

		@Override
		public void run() {
			this.printLoop();
		}

		public static void main(String[] args) throws InterruptedException {

			Thread obj = new Thread(new ThreadDemo2());
			Thread obj2 = new Thread(new ThreadDemo2());
			Thread obj3 = new Thread(new ThreadDemo2());

			obj.start();
			obj.join();
//			System.out.println(obj.getName());
			obj.setName("Thread-0");
			System.out.println(obj.getName());
			System.out.println(obj2.getName());
			System.out.println(obj3.getName());
			obj.setPriority(3);
			obj2.setPriority(6);
			obj3.setPriority(9);
			System.out.println(obj.getPriority());
			System.out.println(obj2.getPriority());
			System.out.println(obj3.getPriority());
			obj2.start();
			obj3.start();

//	 		obj.printLoop();
//			obj2.printLoop();
//			obj3.printLoop();
		}

		
	}
