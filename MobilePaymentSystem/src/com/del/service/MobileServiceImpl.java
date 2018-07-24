package com.del.service;

import com.del.dao.MobileDao;
import com.del.dao.MobileDaoImpl;
import com.del.exception.mobileException;
import com.del.message.Message;



public class MobileServiceImpl implements MobileService {
	private MobileDao mobdao;
	
	
	
	public MobileServiceImpl() {
		mobdao = new MobileDaoImpl();
	}



	@Override
	public boolean authenticate(String mobnum, String password) {
		return mobdao.authenticate(mobnum,password);
		
	}



	@Override
	public void depositAmount(double amount, String mode) throws mobileException {
		if(isAmountNegative(amount))
		{mobdao.depositAmount(amount,mode);}
		
	}



	private boolean isAmountNegative(double amount) throws mobileException {
		if (amount <0) {
			throw new mobileException(Message.AMOUNT_NEGATIVE);
		}
		return true;
		
	}



	@Override
	public double getBalance() {
		
		return mobdao.getBalance();
	}



}
