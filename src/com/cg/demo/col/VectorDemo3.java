package com.cg.demo.col;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VectorDemo3 {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Delete delete = new Delete();

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(emp);
		empList.add(new Employee());
		empList.add(new Employee(403, "ABC", 20.5));
		empList.add(new Employee(404, "XYZ", 55.5));

		System.out.println("Iterate using for loop");

		for (int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i).toString());
		}

		System.out.println("Iterate using for each loop");

		for (Employee e : empList) {
			System.out.println(e.toString());
		}

		System.out.println("Iterate using Iterator");

		Iterator<Employee> iterator = empList.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}

	}
}
