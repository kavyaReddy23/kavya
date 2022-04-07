package com.kavya.demo;

public class Book {
private int id,price,noOfPages;
private String name,author;
public Book()
{
	
}
public Book(int id, String name,String author, int price, int noOfPages) {
	super();
	this.id = id;
	this.price = price;
	this.noOfPages = noOfPages;
	this.name = name;
	this.author = author;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPrice() {
	
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getNoOfPages() {
	return noOfPages;
}
public void setNoOfPages(int noOfPages) {
	this.noOfPages = noOfPages;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@Override
public String toString() {
	
	return "Book [id=" + id + ", price=" + price + ", noOfPages=" + noOfPages + ", name=" + name + ", author=" + author
			+ "]";
	
}


}
