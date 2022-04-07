package com.kavya.demo;
import java.util.*;
public class OneDBookArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Total No of Books : ");
		int totalBooks=scanner.nextInt();

		OneDBookArray books=new OneDBookArray(totalBooks);

		for(int index=0;index<books.getTotalNoOfBooks();index++) {

			System.out.println("Enter Book Id for "+(index+1)+" Book ");
			int id=scanner.nextInt();
			System.out.println("Enter Book Name for "+(index+1)+" Book");
			String name=scanner.next();
			System.out.println("Enter author for "+(index+1)+" Book : ");
			String author=scanner.next();
			System.out.println("Enter price for "+(index+1)+" Book : ");
			int price=scanner.nextInt();
			System.out.println("Enter noOfPages for "+(index+1)+" Book : ");
			int noOfPages=scanner.nextInt();
if(price>1000)
{
			Book book=new Book(id, name, author, price, noOfPages);

			books.setElementAtLocation(book, index);
}
}

		for(Book b:books.getArr()) {
			System.out.println(b); //implicit call to the toString() method of Object Class : toString() returns absoluteclassName@hashcode
		}

	}

}
