package com.cg.demo.col;

import java.util.ArrayList;
import java.util.List;

public class EmpDemo {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Delete delete = new Delete();
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(emp);
		empList.add(new Employee());
		empList.add(new Employee(401, "ABC", 100.5));
//		empList.add("ABC");
//		empList.add(delete);
		
		System.out.println(empList);
		
		
	}

}

