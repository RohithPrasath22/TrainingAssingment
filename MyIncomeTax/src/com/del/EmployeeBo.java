package com.del;

public class EmployeeBo {

	public void calincomeTax(EmployeeVo emp)
	{
		double income = emp.getIncome();
		if(income>1000000)
		{
			double tax = 0.3*income;
			emp.setTax(tax);
		}
		else if(income>500000 && income<=1000000)
		{
			double tax = 0.2*income;
			emp.setTax(tax);
		}
		else
		{
			double tax = 0.1*income;
			emp.setTax(tax);
		}
	}
}
