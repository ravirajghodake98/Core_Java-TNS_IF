package com.cg.application;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc s = new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc c = new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
		return c;
	}

}
