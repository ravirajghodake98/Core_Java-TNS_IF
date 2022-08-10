package com.cg.framework;

public abstract class SavingAcc extends BankAcc
{
	private boolean isSalaried;
	static final private float MINBAL = 10000.0f;
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	
	public void withdraw(float balance)
	{
		System.out.println("Account no. is: " +this.getAccNo()+ ", Account name is: " +this.getAccNm()+ 
				" and Account balance is: " +balance);
	}

	//toString method
	@Override
	public String toString() {
		return String.format("SavingAcc [isSalaried=%s]", isSalaried);
	}
	

}
