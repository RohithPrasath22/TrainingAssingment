package com.del;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	     int n = 0;
	     System.out.println("enter the number to calculate factorial");
	     Scanner scan = new Scanner(System.in);
	     n=scan.nextInt();
	       double result = 1;
	       for (int i = 1; i <= n; i++) {
	           result = result * i;
	       }
	       System.out.println("The factorial of " +n+" is " +result);
	   }

	}


