package com.test.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Simple {

	public static void main(String[] args) {
		int[] arr={2,7,6,9,8};
		List<Integer> list=new ArrayList<>();       
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(9);
		list.add(8);
		list.add(2);
		list.add(7);
		Set<Integer> list1 = new HashSet<>();
		for(Integer i:list)
		{
		list1.add(i);
		}
		Collections.sort(list);
		for(Integer i:list1)
		{
		System.err.println(i);
		}
		
		int[] arr1=new int[arr.length];

		for(int i=0;i<arr.length;i++)
		{
		for(int j=i;j<arr.length;j++)
		{
		if(arr[i] < arr[j])
		{
		arr[i] = arr[i];
		}
				
				  else { arr[i] = arr[j]; }
				 
		}
		}

		/*
		 * for(int i:arr1) { System.err.println(i); }
		 */
		
		
	}

}
