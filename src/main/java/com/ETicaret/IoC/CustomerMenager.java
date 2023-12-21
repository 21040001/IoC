package com.ETicaret.IoC;


public class CustomerMenager implements ICustomerService {

	private ICustomerMeneger iCustomerMeneger;

	/*public CustomerMenager(ICustomerMeneger iCustomerMeneger) {
		this.iCustomerMeneger = iCustomerMeneger;
	}*/
	

	public void setiCustomerMeneger(ICustomerMeneger iCustomerMeneger) {
		this.iCustomerMeneger = iCustomerMeneger;
	}
	
	public void odeme_yontemi() {
		iCustomerMeneger.add();
	}
	public void faiz_orani() {
		iCustomerMeneger.faiz(); 
	}
	
}
