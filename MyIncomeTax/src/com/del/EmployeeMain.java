package com.del;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int number = sc.nextInt();
	    ArrayList<EmployeeVo> arr = new ArrayList<>(); 
	    for(int i=0;i<number;i++)
	    {
	    	System.out.println("Enter employee details ; ");
	    	arr.add(new EmployeeVo(sc.nextInt(),sc.next() ,sc.nextDouble(), null));
	        arr.get(i).calincomeTax(arr.get(i));
	    }
	    
	    for (EmployeeVo emp : arr) {
			System.out.println(emp.toString());
		} 
	    
	    System.out.println("----------------------------");
	    System.out.println("Sorted list is :");
	    
	    Collections.sort(arr, new Emplyeesort());
		for (EmployeeVo emp : arr) {
			System.out.println(emp);
		}

	}

}
