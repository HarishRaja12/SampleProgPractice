package com.test.demo;

public class ExceptionTest {
	public static int m1(int i,int j)
	{
		try {
			j=j-i;
			return j;
		} catch (Exception e) {
			return 0;
		}
		finally {
			i=i+j;
			System.err.println(i);
		}
	}
public static void main(String[] args) {
	int i=10;
	int j=20;
	System.err.println(m1(i,j));
}
}
