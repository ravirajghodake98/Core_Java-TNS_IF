package com.cg.framework;

public abstract class BankAcc 
{
	private int accNo;
	private String accNm;
	private float accBal;
	
	//constructor
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
		
	}
	
	//abstract method withdraw
	abstract public void withdraw(float balance);
	public void deposit(float balance)
	{
		System.out.println("balance");
	}
	
	//getters and setters method for private variables
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	//toString method
	@Override
	public String toString() {
		return String.format("BankAcc [accNo=%s, accNm=%s, accBal=%s]", accNo, accNm, accBal);
	}
	
	
}
