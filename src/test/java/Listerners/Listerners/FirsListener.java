package Listerners.Listerners;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirsListener {

	@Test
	public void hellWorld() {
		System.out.println("Hello world");
		Reporter.log("Custom log");
	}
	
}
