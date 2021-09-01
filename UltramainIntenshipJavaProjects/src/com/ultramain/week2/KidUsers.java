package com.ultramain.week2;

public class KidUsers implements LibraryUser {
	private int age;
	private String bookType;
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public void registerAccount() {
		if(!(age<0 || age>12)){
			System.out.println("You Have Successfully Registered Under A Kids Account..");
		}
		else{
			System.out.println("Sorry, Age Must Be Less Than 12 To Register As A Kid..");
		}
	}

	public void requestBook() {
		if(bookType =="Kids"){
			System.out.println("Book Issued Successfully, Please Return In 10 Days");
		}
		else{
			System.out.println("Oops, You Are Allowed To Take Only Kids Book..");
		}
	}

}
