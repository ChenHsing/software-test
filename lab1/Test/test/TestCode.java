package test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import code.Problem;

public class TestCode {
	private Problem pro = null;
	
	@Before
	public void setUp(){
		pro = new Problem();
	}
	 
	@Test
	public void Test() {
		assertEquals (false,pro.isTrue(88));
		assertEquals (true,pro.isTrue(5));
	}
}
