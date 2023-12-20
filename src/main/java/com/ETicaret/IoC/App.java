package com.ETicaret.IoC;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    	
		
    	try (ClassPathXmlApplicationContext context = 
    			new ClassPathXmlApplicationContext("applicationContext.xml")) {
			CustomerMenager meneger = new CustomerMenager(context.getBean("odeme_yontemi",ICustomerMeneger.class));
			meneger.odeme_yontemi();
			meneger.faiz_orani();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    
     
    
    
    }
    
}
