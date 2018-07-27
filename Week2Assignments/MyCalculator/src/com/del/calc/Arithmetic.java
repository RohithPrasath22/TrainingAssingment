package com.del.calc;

import java.util.Scanner;

public abstract class Arithmetic {

	public abstract void calculate(int num1, int num2);

	Scanner scan = new Scanner(System.in);

	public void read() {
		System.out.println("Enter Two Numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		this.calculate(num1, num2);

	}

	public void display(int res) {
		System.out.println("Result: " + res);
	}

}
