package com.kavya.demo;

public class OneDBookArray {
	private Book arr[];
	private int totalNoOfBooks;
	public OneDBookArray(int totalNoOfBooks) {
		super();
		this.totalNoOfBooks = totalNoOfBooks;
		arr=new Book[totalNoOfBooks];
	}
	public Book[] getArr() {
		return arr;
	}


	public int getTotalNoOfBooks() {
		return totalNoOfBooks;
	}

	public void setElementAtLocation(Book element,int index) {
		arr[index]=element;
	}

	public Book getElementFromLocation(int index) {
		return arr[index];
	}

}

