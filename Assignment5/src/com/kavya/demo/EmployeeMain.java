package com.kavya.demo;
import java.util.*;
public class EmployeeMain {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		
		String[] arr=new String[] {"ABC","DEF","GHI","JKL","MNO"};
		int age;
		String name;
		try
		{
			System.out.println("Enter age of employee");
			 age=scanner.nextInt();
			Employee employee=new Employee(age);
			System.out.println("enter name of the employee");
			 name=scanner.next();
			
			Employee employee1=new Employee(arr,"ABC");
			
			
			
		}
		catch(AgeException ageException)
		{
			System.out.println("Age Exception caught");
			Employee employee1=new Employee();
			System.out.println("enter employee age correctly: ");
			employee1.setAge(scanner.nextInt());
			System.out.println("age= "+employee1.getAge());
		}
		catch(NameException nameException)
		{
			System.out.println("Name Exception caught");
			System.out.println("enter employee name correctly: ");
			Employee employee1=new Employee();
			employee1.setName(scanner.next());
			
			System.out.println("name= "+employee1.getName());
		}
		
		
		
	}

}
