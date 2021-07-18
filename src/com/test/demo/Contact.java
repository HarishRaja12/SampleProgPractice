package com.test.demo;

public class Contact {

private static Contact conObj=null;

private Contact()
{
	
}
public Contact getConObj()
{
	if(null == conObj)
	{
		synchronized (Contact.class) {
			if(null == conObj)
			{
				conObj = new Contact();
			}
		}
	}
	return conObj;
}
}
