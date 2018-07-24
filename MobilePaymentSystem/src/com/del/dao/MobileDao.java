package com.del.dao;

import com.del.exception.mobileException;

public interface MobileDao {


	boolean authenticate(String mobnum, String password);

	void depositAmount(double amount, String mode) throws mobileException;

	double getBalance();

}
