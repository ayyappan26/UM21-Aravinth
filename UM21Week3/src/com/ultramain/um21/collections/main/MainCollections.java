package com.ultramain.um21.collections.main;

import java.util.List;

import com.ultramain.um21.collections.ListManager;

/**
 * @author Black
 * Converts the String array to ArrayList and sort it
 */
public class MainCollections {

	public static void main(String[] args) {
		ListManager sortedArr = new ListManager();
		List<String> list = sortedArr.getArrayList();
		for (String i : list) {
			System.out.println(i);
		}
	}
}
