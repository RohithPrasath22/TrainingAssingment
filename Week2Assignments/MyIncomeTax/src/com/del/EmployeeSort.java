package com.del;

import java.util.Comparator;

public class EmployeeSort implements Comparator<employeeVo> {
	
	@Override
	public int compare(employeeVo ev1, employeeVo ev2) {
		return (int) (ev1.getIncometax() - ev2.getIncometax());
	}

}
 