package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrimeAcc;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopFactory s = new GSShopFactory();
		PrimeAcc p = new GSPrimeAcc(1001, "Raviraj", 500, true);
		NormalAcc n = new GSNormalAcc(2001, "Starlord", 750, 50);
		
		//for prime account output
		System.out.println("Prime Account");
		p.bookProduct(p.getCharges());
		
		//for normal account output
		System.out.println("Normal Account");
		n.bookProduct(n.getCharges());
		
		System.out.println(p);
		System.out.println(n);
	}

}
