package com.simple.programmer.proteintracker.test;


import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

import com.simple.programmer.User;

@RunWith(Parameterized.class)
public class ParameterizedTest {

	private static User user = new User();
	private int input;
	private int expected;
	
	public ParameterizedTest(int input, int expected) {
		this.input = input;
		this.expected = expected;
		
	}
	
	@Parameters
	public static List<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{2,5},{32,45},{21,45},{42,35}
		});
	}
	
	@Test
	public void test(){
		if(input >= 0){
			user.setTotal(input);
		}else{
			user.setTotal(-input);
		}
		
		assertEquals(expected, user.getTotal());
	}
	
	
}









