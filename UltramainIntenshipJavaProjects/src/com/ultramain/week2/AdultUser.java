package com.ultramain.week2;

public class AdultUser implements LibraryUser {
	int age;
	String bookType;
	
	

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
		if(!(age<12)){
			System.out.println("You Have Successfully Registered Under A Adult Account..");
		}
		else{
			System.out.println("Sorry, Age Must Be Greter Than 12 To Register As A Adult..");
		}
	}

	public void requestBook() {
		if(bookType =="Fiction"){
			System.out.println("Book Issued Successfully, Please Return The Book WithIn 7 Days");
		}
		else{
			System.out.println("Oops, You Are Allowed To Take Only Adult Fiction Books..");
		}
	}

}
