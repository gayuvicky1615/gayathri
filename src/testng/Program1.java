package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program1 {
	@Test
	public void demo(){
		Reporter.log("hello vicky",true);
		Reporter.log("hello gayu",false);
	}

}
