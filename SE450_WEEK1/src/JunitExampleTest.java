import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JunitExampleTest {
	StringObjectJunit aJunit;
	StringObjectJunit bJunit;
	
	@Before
	public void testSetup(){
		aJunit = new StringObjectJunit("Hello");
		bJunit = new StringObjectJunit("World");
		
	}
	
	@Test
	public void testSwap(){
		// Arrange
		
		// Act
		aJunit.swap(bJunit);
		
		// Assert
		
//		Failure example
//		assertEquals("Swap did not occur for a", aJunit.str, "Hello");
		
		assertEquals(aJunit.str, "World");
		assertEquals(bJunit.str, "Hello");
	}
	
	@Test
	public void testSwapWithNullParameters(){
		// Arrange
		
		try{
			// Act
			aJunit.swap(null);
			// If fail() executes, means does not in catch block.
			fail();
		} catch (Exception ex) {
			// Assert
			assertTrue(ex.getClass() == new NullPointerException().getClass());
			assertEquals(ex.getMessage(), "Parameters can't be null");
		}
	}
	
	@Test
	public void testSwapWithNullStringValues(){
		// Arrange
		StringObjectJunit aJunit = new StringObjectJunit("Hello");
		StringObjectJunit bJunit = new StringObjectJunit(null);
		
		// Act
		aJunit.swap(bJunit);
		
		// Assert
		assertEquals(aJunit.str, null);
		assertEquals(bJunit.str, "Hello");
	}
}
