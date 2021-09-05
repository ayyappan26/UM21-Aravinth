package com.ultramain.um21.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Black
 * To format the date using SimpleDateFormater
 */
public class GettingDate {

	public static void main(String[] args) {
		dateFormat();

	}
	/**
	 * Format the date using SinpleDate 
	 */
	public static void dateFormat(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the date and time formate to display..");
		String str=scan.next();
		SimpleDateFormat formatter=new SimpleDateFormat(str);
		Date date=new Date();
		System.out.println(formatter.format(date));
	}
}
