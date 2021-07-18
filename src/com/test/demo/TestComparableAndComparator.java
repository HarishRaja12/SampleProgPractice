package com.test.demo;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TestComparableAndComparator {

	public static void main(String[] args) {

		List<Employee> list = new LinkedList<>();
		list.add(new Employee(1,"Harish",26));
		list.add(new Employee(2,"Raja",30));
		list.add(new Employee(3,"Vadhina",29));
		list.add(new Employee(4,"Amma",48));
		list.add(new Employee(5,"Bhaskar",25));
		//Collections.sort(list,new AgeComparator());
		//Collections.sort(list,new EmpNameComparator());
		list.sort((Employee e1,Employee e2) -> e1.getEmpName().compareTo(e2.getEmpName()));
		Map<Integer,Employee> map =new LinkedHashMap<>();
		map.put(1, new Employee(1,"Harish",26));
		map.put(4, new Employee(2,"Raja",30));
		map.put(3, new Employee(3,"Vadhina",29));
		map.put(2, new Employee(4,"Amma",48));
		map.put(5, new Employee(1,"Harish",26));
		map.put(6, new Employee(5,"Bhaskar",25));
		System.err.println(list);
	}

}
