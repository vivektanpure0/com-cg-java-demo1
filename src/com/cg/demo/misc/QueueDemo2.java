package com.cg.demo.misc;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class QueueDemo2 {
	public static void main(String[] args) {
		
		Random random = new Random();
		PriorityQueue obj1 = new PriorityQueue();
		Queue obj2 = new LinkedList();
		
		for (int i=1; i<=5; i++) {
			int j = random.nextInt(10);
			obj1.add((j));
			obj2.add((j));
			
			
		}
		System.out.println(obj1);
		System.out.println(obj2);
		obj1.poll();
		obj2.poll();
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		
		
		
		
		
	}

}
