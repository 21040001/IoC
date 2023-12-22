package com.ETicaret.IoC;

public class StripeDal implements ICustomerMeneger {

	String faiz;
	
	
	public String getFaiz() {
		return faiz;
	}

	public void setFaiz(String faiz) {
		this.faiz = faiz;
	}

	@Override
	public void add() {
		System.out.println("odeme sekli Stripe");
		
	}

	@Override
	public void faiz() {
		System.out.println("STripe faiz orani "+faiz );
	}

}
