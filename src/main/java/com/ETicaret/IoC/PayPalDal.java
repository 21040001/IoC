package com.ETicaret.IoC;

public class PayPalDal  implements ICustomerMeneger{
	
	String faiz;
	
	

	public String getFaiz() {
		return faiz;
	}

	public void setFaiz(String faiz) {
		this.faiz = faiz;
	}

	@Override
	public void add() {
		System.out.println("odeme sekli PayPal");
	}

	@Override
	public void faiz() {
		System.out.println("paypal faiz miktari "+faiz);
		
	}


}
