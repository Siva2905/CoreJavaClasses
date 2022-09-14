package heairarchialInheritance;

import org.junit.Test;

//Heairarchial where 2 or more child classes (sub classes) will inheritate the properties of same parent class(super class)

// Test Case-- 1 is Child Class(sub class)
public class TestCases1 extends TestReusableComponents
{
	@Test
    public void composeAndSendMail()
    {
   	 System.out.println("Test Case Compose And Send Mail");
   	 launchApplication();
   	 logintoApplication();
   	 compose();
   	 send();
   	 logout();
   	 close();
    }
	
	@Test
    public void replyToMail()
    {
   	 System.out.println("Tast Case Reply To Mail");
   	 launchApplication();
   	 logintoApplication();
   	 open();
   	 reply();
   	 logout();
   	 close();
    }
	

}
