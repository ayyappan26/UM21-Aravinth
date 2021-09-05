package com.ultramain.um21.filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Black 
 * To write and read a file using java.
 */
public class Read {

	public static void main(String[] args) {
		WriteFile();
		ReadFile();
	}

	/**
	 * To read the file in java.
	 */
	public static void ReadFile() {
		File file = new File("E:\\Git.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));

			String str;

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * To write a file using java.
	 */
	public static void WriteFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to be added..");
		String str = sc.next();
		try {
			FileWriter file = new FileWriter("E:\\Git.txt");
			file.write(str);
			file.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
