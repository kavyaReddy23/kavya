package com.kavya.demo;

public class Employee {
	private int age;
	private String name;
	private String arr[]=new String[5];
	public Employee()
	{
		
	}
	
	public Employee(int age) throws AgeException{
		if(age<0||age<18||age>60)
		{
			throw new AgeException("age cant be less than 0 or less than 18 or greater than 60");
		}
		this.age = age;
	}
	public Employee(String arr[],String name) throws NameException
	{
		for(int i=0;i<arr.length;i++)
		{
		if(name==arr[i])
		{
			throw new NameException("Name already Exists");
		}
		}
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	
	

}
