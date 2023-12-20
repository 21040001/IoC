package com.ETicaret.IoC;




/**
Problem: Bir e-ticaret uygulaması geliştiriyorsunuz ve 
uygulamanızın farklı ödeme hizmetleriyle entegre olabilmesi
gerekiyor (örneğin, PayPal, Stripe, vb.). Her ödeme hizmeti,
ödeme işlemlerini gerçekleştirmek için kendi API’lerini
kullanır. Uygulamanızın, hangi ödeme hizmetinin kullanıldığına
bakılmaksızın, ödeme işlemlerini sorunsuz bir şekilde 
gerçekleştirebilmesi gerekmektedir.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
		
			CustomerMenager meneger = new CustomerMenager(new PayPalDal());
			meneger.odeme_yontemi();
   
			meneger.faiz_orani();
		
    
     
    
    
    }
    
}
