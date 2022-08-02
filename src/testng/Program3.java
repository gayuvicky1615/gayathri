package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program3 {
	  @Test(priority=1, invocationCount = 2)
      public void calls() {
   	   Reporter.log("calls", true);
      }
      @Test(priority=-1, enabled= false)
      public void settings() {
   	   Reporter.log("setting", true);
      }
      @Test(priority=-1)
      public void chats() {
   	   Reporter.log("chats", true);
      }

}
