package com.del;

import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array");
		int length = scan.nextInt();
		System.out.println("Enter The Elements Of The Array");
		
		int arr[] = new int[length];
		for (int i = 0; i < length; i++) {
		        arr[i] = scan.nextInt();
		}
		
		UserMainCode obj=new UserMainCode();
		boolean check=obj.checkTriplets(arr);
		
		System.out.println(check);
		

	}

}
