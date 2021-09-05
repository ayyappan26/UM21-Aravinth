package com.ultramain.um21.collections;

import java.util.*;

/**
 * @author Black
 * To load the elements in array to ArrayList and sort it
 */
public class ListManager {
	private  String str[] = { "Raja","Babu", "Aravinth", "Siva" };


	public  List<String> getArrayList() {
		List<String> strArr = new ArrayList<>();
		strArr = Arrays.asList(str);
		//Collections.sort(strArr);
		TreeSet<String> newstr=new TreeSet<>(strArr);
		ArrayList<String> sortedArr=new ArrayList<>(newstr);
		return sortedArr;
	}
}
