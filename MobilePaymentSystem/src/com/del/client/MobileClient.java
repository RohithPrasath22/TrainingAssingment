package com.del.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.del.exception.mobileException;
import com.del.service.MobileService;
import com.del.service.MobileServiceImpl;

public class MobileClient {
	private MobileService mobservice;

	public MobileClient() {
		mobservice = new MobileServiceImpl();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("Enter your Username");
		String mobnum = scan.nextLine();
		
		System.out.println("enter the password");
		String password = scan.nextLine();
		Boolean login = mobservice.authenticate(mobnum, password);
		if (login) {
			while (true) {

				choice = getChoice(scan);
				switch (choice) {
				case 1:
					System.out.println("DEPOSIT AMOUNT ");
					System.out.println("Enter Mode Of Payment 1)credit card 2)debit card 3)UPI");
					String mode = "";
					try {
						mode = scan.nextLine();
					} catch (InputMismatchException e) {
						System.err.println("Enter valid mode Only");
						scan.nextLine();
					}
					System.out.println("Enter Amount To Be deposited");
					double amount = 0;
					try {
						amount = scan.nextDouble();
						mobservice.depositAmount(amount, mode);
					} catch (mobileException e) {
						System.err.println(e.getMessage());
					} catch (InputMismatchException e) {
						System.err.println("Enter Number Only");
						scan.nextLine();
					}
					break;
				case 2:
					System.out.println("CHECKING BALANCE");
					double balance = mobservice.getBalance();
					System.out.println("Balance: " + balance);
					break;
				case 3:
					System.out.println("Exiting The Service... Thank you.");
					System.exit(0);
					break;
				default:
					System.out.println("Enter A Valid Choice");
					break;
				}
			}

		} else {
			System.err.println("incorrect username or password");
		}
	}

	private int getChoice(Scanner scan) {
		int choice = 0;
		System.out.println("MOBILE PAYMENT SYSTEM");
		System.out.println("1. Deposit Amount");
		System.out.println("2. Check Balance");
		System.out.println("3. Quit");
		System.out.println("Enter a choice from 1 to 3");
		try {
			choice = scan.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Please Enter Numbers Only");
			scan.nextLine();
		}
		return choice;

	}

	public static void main(String[] args) {
		new MobileClient();
	}

}
