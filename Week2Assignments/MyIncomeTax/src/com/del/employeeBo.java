package com.del;

public class employeeBo {
	
	void calincomeTax(employeeVo ev) {
		double tax;
		double income = ev.getAnnualincome();
		double taxable = income*0.8;
		if (taxable <200000) {
			tax=taxable*0.1;
			ev.setIncometax(tax);
		}
		if (taxable <500000) {
			tax=taxable*0.2;
			ev.setIncometax(tax);
		}
		if (taxable >1000000) {
			tax=taxable*0.3;
			ev.setIncometax(tax);
		}
	}
}
