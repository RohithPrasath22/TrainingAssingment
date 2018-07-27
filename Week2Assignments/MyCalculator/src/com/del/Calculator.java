package com.del;

import java.util.Scanner;

import com.del.calc.add;
import com.del.calc.Arithmetic;
import com.del.calc.division;
import com.del.calc.multiply;
import com.del.calc.subtract;

public class Calculator {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 0 for Addition");
		System.out.println("Enter 1 for Subtraction");
		System.out.println("Enter 2 for Multiplication");
		System.out.println("Enter 3 for Division");
		System.out.println("Choose Operation to perform");
		int choice = scan.nextInt();

		Arithmetic arr[] = { new add(), new subtract(), new multiply(), new division() };
		arr[choice].read();

	}

	
}
