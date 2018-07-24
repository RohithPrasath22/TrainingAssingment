package com.del.service;

import com.del.exception.mobileException;

public interface MobileService {

	boolean authenticate(String mobnum, String password);

	void depositAmount(double amount, String mode) throws mobileException;

	double getBalance();

}
