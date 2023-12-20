package com.ETicaret.IoC;

public class PayPalDal  implements ICustomerMeneger{

	@Override
	public void add() {
		System.out.println("odeme sekli PayPal");
	}

	@Override
	public void faiz() {
		System.out.println("paypal faiz miktari 10%");
		
	}


}
