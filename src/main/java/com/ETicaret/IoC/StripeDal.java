package com.ETicaret.IoC;

public class StripeDal implements ICustomerMeneger {

	@Override
	public void add() {
		System.out.println("odeme sekli Stripe");
		
	}

	@Override
	public void faiz() {
		System.out.println("STripe faiz orani 20%" );
	}

}
