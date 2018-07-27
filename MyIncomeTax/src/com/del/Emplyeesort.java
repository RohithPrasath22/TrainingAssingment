package com.del;

import java.util.Comparator;

public class Emplyeesort implements Comparator<EmployeeVo> {

	@Override
	public int compare(EmployeeVo o1, EmployeeVo o2) {
		
		return (int)(o1.getTax()-(o2.getTax()));
	}

}