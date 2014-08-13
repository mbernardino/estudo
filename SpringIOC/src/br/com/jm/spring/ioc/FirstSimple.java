package br.com.jm.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.jm.spring.ioc.beans.VerySimpleBean;

public class FirstSimple {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("br/com/jm/spring/ioc/beans.xml");
		
		VerySimpleBean verySimpleBean = (VerySimpleBean) context.getBean("verySimpleBean");
		
		System.out.println(verySimpleBean.getVerySimpleProperty());
		
	}
}
