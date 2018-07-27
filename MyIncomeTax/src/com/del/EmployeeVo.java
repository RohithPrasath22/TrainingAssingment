package com.del;

public class EmployeeVo extends EmployeeBo {

	int empid;
	String empname;
	Double Income;
	Double tax;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Double getIncome() {
		return Income;
	}

	public void setIncome(Double income) {
		Income = income;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "EmployeeVo Details [empid=" + empid + ", empname=" + empname + ", Income=" + Income + ", tax=" + tax
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Income == null) ? 0 : Income.hashCode());
		result = prime * result + empid;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeVo other = (EmployeeVo) obj;
		if (Income == null) {
			if (other.Income != null)
				return false;
		} else if (!Income.equals(other.Income))
			return false;
		if (empid != other.empid)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		return true;
	}

	public EmployeeVo(int empid, String empname, Double income, Double tax) {
		super();
		this.empid = empid;
		this.empname = empname;
		Income = income;
		this.tax = tax;
	}

}