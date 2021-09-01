package com.ultramain.um21.array;

import java.util.Scanner;

public class EmployeeUtility {
	private EmployeeUtility() {
	}

	public static Scanner scan;

	public static Scanner getScannerInstsnce() {
		if (scan == null) {
			scan = new Scanner(System.in);
		}
		return scan;
	}
}
