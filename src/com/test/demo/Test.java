package com.test.demo;

import java.util.ArrayList;
import java.util.List;

class Student {

	public static int count;
	private int id;
	private String name;
	private List<String> dept;
	public Student(int count1,int id,String name,List<String> dept)
	{
		count=count1;
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
}

public class Test
{
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("ec");
		list.add("cs");
		
		Student obj = new Student(Student.count++,123,"harish",list);
		System.out.println("Obj:: "+obj);
		
	}
}