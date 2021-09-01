package com.ultramain.um21.main;
import com.ultramain.week2.*;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers kid=new KidUsers();
		kid.setAge(10);
		kid.registerAccount();
		kid.setBookType("Kids");
		kid.requestBook();
		kid.setAge(18);
		kid.registerAccount();
		kid.setBookType("Fiction");
		kid.requestBook();
		System.out.println("----------------------------------");
		
		AdultUser adult=new AdultUser();
		adult.setAge(5);
		adult.registerAccount();
		adult.setBookType("Kids");
		adult.requestBook();
		adult.setAge(23);
		adult.registerAccount();
		adult.setBookType("Fiction");
		adult.requestBook();
		
	}

}
