package hello;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {

	
	@Test
	public void testGreetingMessage()
	{
		Greetings greetings = new Greetings();
		
		Assert.assertEquals("Hello World", greetings.displayGreetingMessage());
	}
}
