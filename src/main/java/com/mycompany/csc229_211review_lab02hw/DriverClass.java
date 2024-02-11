package com.mycompany.csc229_211review_lab02hw;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	public static void main(String[] args) {
		//initialization of scanner
		Scanner scan = new Scanner(System.in);

		//std1 initialized with name "James", age (typecast to short) 20, GPA of 3.5, and address "123 Main Street
		Student std1= new Student("James", (short)20,3.5, "123 Main Street");

		//prompt user for input
		System.out.println("Enter new GPA: ");
		//set GPA to double from user input
		std1.setGPA(scan.nextDouble());

		//print out output from std1
		System.out.println(std1);

	}

}