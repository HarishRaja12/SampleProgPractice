package com.test.demo;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e, Employee e1) {
		if(e.getAge() == e1.getAge())
		{
			return 0;
		}
		else if(e.getAge() > e1.getAge())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
