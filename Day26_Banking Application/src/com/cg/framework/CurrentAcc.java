package com.cg.framework;

public abstract class CurrentAcc extends BankAcc
{
	private final float creditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	public void withdraw(float balance)
	{
		System.out.println("Account no. is: " +this.getAccNo()+ ", Account name is: " +this.getAccNm()+ 
				" and Account balance is: " +(balance + creditLimit));
	}

	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}
	
}
