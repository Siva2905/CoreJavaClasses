package simpleInheritance;

import org.junit.Test;

//Simple Inheritance--- Directly child class(subclass) will inheritate the parent class(super class)

// Child class(Subclass)
public class TestCases extends TestResuableComponents
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
	
	@Test
     public void ForwardMail()
     {
    	 System.out.println("Tast Case Forward Mail");
    	 launchApplication();
    	 logintoApplication();
    	 open();
    	 forward();
    	 logout();
    	 close();
     }
	
	@Test
     public void DeleteMail()
     {
    	 System.out.println("Tast Case Forward Mail");
    	 launchApplication();
    	 logintoApplication();
    	 open();
    	 delete();
    	 logout();
    	 close();
     }
     
}
