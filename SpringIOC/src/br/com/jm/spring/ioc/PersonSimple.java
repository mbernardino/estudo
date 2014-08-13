package br.com.jm.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.jm.spring.ioc.beans.person.Address;
import br.com.jm.spring.ioc.beans.person.Person;

public class PersonSimple {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("br/com/jm/spring/ioc/person.xml");
		
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		
		Address address = (Address) context.getBean("address");
		System.out.println(address);
		
	}
}
