package com.del.dao;

import com.del.exception.mobileException;
import com.del.message.Message;

public class MobileDaoImpl implements MobileDao {
	private double balance;	
	private String mobnum="Rohith";
	private String password="rogue123";

	@Override
	public boolean authenticate(String mobnum, String password) {
		return this.mobnum.equals(mobnum) && this.password.equals(password);
		
	}

	@Override
	public void depositAmount(double amount, String mode) throws mobileException {
		balance = balance - amount;
		System.out.println("the payment mode chosen is "+mode);
		if(balance<0) {
			throw new mobileException(Message.ZERO_BALANCE);
		}
		
	}

	@Override
	public double getBalance() {
		
		return balance;
	}

}
