package com.del;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Employeemain {
	 
	public static void main(String[] args) {
		employeeVo ev = new employeeVo();
		employeeBo eb = new employeeBo();
		EmployeeSort es = new EmployeeSort();
		ArrayList<employeeVo> arr = new ArrayList<employeeVo>();
		
		int count;
		int i = 1;
		System.out.println("enter the number of employees");
		Scanner scan = new Scanner(System.in);
		count = scan.nextInt();
		while (i <= count) {
			System.out.println("Enter the details of employee 1)employee id 2)employee name 3)annual income");
			ev.setEmpid(scan.nextInt());
			ev.setEmpname(scan.next());
			ev.setAnnualincome(scan.nextDouble());
			eb.calincomeTax(ev);
			i++;
			
		}
		System.out.println("Displaying the employee details");
		System.out.println(ev.getEmpid());
		System.out.println(ev.getEmpname());
		System.out.println(ev.getAnnualincome());
		System.out.println("income tax to be paid is"+ev.getIncometax());
		Collections.sort(arr, es);
		 System.out.println("Sorted by incometax");
	        for (int j=0; j<arr.size(); j++)
	            {System.out.println(arr.get(j));}
		
	}


}
