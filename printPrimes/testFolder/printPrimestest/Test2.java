package printPrimestest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

import primes.Prime;
public class Test2 {
	Prime prime = null;
	@Before
	public void setup() {
		prime = new Prime();
	}

	@Test
    public void test1() {
        assertEquals("2 3 5 ", prime.printPrimes(3));

    }
	
	@Test
	public void  test2(){
		assertEquals ("2 3 5 7 11 ",prime.printPrimes(5));
	}
}
