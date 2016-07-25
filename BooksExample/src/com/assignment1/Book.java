package com.assignment1;

public class Book {
	
	String genre;
	String title;
	String pages;
	float price;
	
	
	
	
	public Book(String genre, String title, String pages, float price) {
		this.genre = genre;
		this.title = title;
		this.pages = pages;
		this.price = price;
	}



	public Book() {
		// TODO Auto-generated constructor stub
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getPages() {
		return pages;
	}



	public void setPages(String pages) {
		this.pages = pages;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	public String tellMeAboutTheBook() {
		return "The name of the book is " + title + " the genre is " + genre + " it has " + pages + " and costs $" + price;
		
	}
	

}
