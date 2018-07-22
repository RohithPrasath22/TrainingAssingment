package com.del;

import java.util.Scanner;

public class Calculator {
private static BasicCalculator bcal;
	public static void main(String[] args) {
		bcal =new BasicCalculatorimpl();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers :");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
       
            System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide ");
            System.out.println("\n Enter your choice ");
            int ch = scan.nextInt();
            switch(ch){
                case 1 : System.out.println(bcal.add(a,b));
                            break;
                case 2 : System.out.println(bcal.subtract(a,b));
                            break;
                case 3 : System.out.println(bcal.multiply(a,b));
                            break;
                case 4 : System.out.println(bcal.divide(a,b));
                			break;
                default : System.out.println("WRONG INPUT");
       
   }
      
    }

	}


