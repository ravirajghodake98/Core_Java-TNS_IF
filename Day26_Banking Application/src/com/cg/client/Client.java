package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(123456789, "Raviraj", 6303600, true);
		CurrentAcc c = new MMCurrentAcc(987654321, "Starlord", 6846165, 100000);
		
		//for savings account
		System.out.println("Saving Account");
		s.withdraw(s.getAccBal());;
		System.out.println();
		
		//for current account
		System.out.println("Current Account");
		c.withdraw(c.getAccBal());;
		System.out.println();
		
		System.out.println(s);
		System.out.println(c);
	}

}
