package hello;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class GreeterTest {

	Greeter greeter = new Greeter();
	@Test
	public void greeterSaysHello() {
		assertThat(greeter.sayHello(), containsString("Hello"));
	}
	
	/*@Test
	public void testSayHi() {
		fail("Not yet implemented");
	}*/
	
}
