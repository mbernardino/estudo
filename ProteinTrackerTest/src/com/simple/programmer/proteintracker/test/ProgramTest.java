package com.simple.programmer.proteintracker.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.Timeout;

import com.simple.programmer.User;

public class ProgramTest {
	
	private User user;
	
	@BeforeClass
	public static void before(){
		System.out.println("Before Class ...");
	}
	
	@AfterClass
	public static void after(){
		System.out.println("... After Class");
	}
	
	
	@Before
	public void setUp(){
		System.out.println("before!");
		user = new User();
	}
	
	@After
	public void tearDown(){
		System.out.println("After!");
	}

	@Test 
	@Category({GoodTestCategory.class, BadTestCategory.class})
	public void valorInicialTotal(){
		assertEquals("Esperado 0", 0, user.getTotal());
	}
	
	@Test @Category(GoodTestCategory.class)
	public void addValorTotal(){
		user.setTotal(10);
		assertEquals("Esperado 10", 10,  user.getTotal());
	}
	
	@Rule
	public Timeout timeOut = new Timeout(20);
	
	@Test
//	@Ignore
//	@Test(timeout = 200)
	@Category(GoodTestCategory.class)
	public void badTest(){
		for(int i = 0; i < 1000000000; i++){
			user.setTotal(1);
		}
	}
	

}
