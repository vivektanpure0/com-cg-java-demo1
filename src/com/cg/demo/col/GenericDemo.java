package com.cg.demo.col;

import java.util.ArrayList;
import java.util.List;

class Delete {
	
}

public class GenericDemo {
	public static void main(String[] args) {
		
		List<Integer> markList = new ArrayList<>();
		
		Delete delete = new Delete();
		
		markList.add(98);
		markList.add(5045);
		markList.add("ABC");
		markList.add(delete);
		
	}

}
