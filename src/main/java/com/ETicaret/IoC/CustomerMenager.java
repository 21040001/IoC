package com.ETicaret.IoC;


public class CustomerMenager {

	private ICustomerMeneger iCustomerMeneger;

	public CustomerMenager(ICustomerMeneger iCustomerMeneger) {
		this.iCustomerMeneger = iCustomerMeneger;
	}
	public void odeme_yontemi() {
		iCustomerMeneger.add();
	}
	
	public void faiz_orani() {
		iCustomerMeneger.faiz(); 
	}
	
}
