package day5TNSIF.MultilevelInheritance;

import java.util.Date;

public class LevelOneEmployee {
	
	private int noOfShares;
	private String authority;
	
	public LevelOneEmployee(String name, long contactNo, Date dateOfBirth,String deptName, double baseSalary,int noOfShares, String authority)
	{
		super();
		this.noOfShares=noOfShares;
		this.authority=authority;
		
	}

	public int getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "LevelOneEmployee [noOfShares=" + noOfShares + ", authority=" + authority + ", getDeptName()="
				+ getDeptName() + ", getBaseSalary()=" + getBaseSalary() + ", toString()=" + super.toString()
				+ ", getName()=" + getName() + ", getContactNo()=" + getContactNo() + ", getDateOfBirth()="
				+ getDateOfBirth() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	private String getDateOfBirth() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getContactNo() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getBaseSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getDeptName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}


