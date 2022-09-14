package inheritanceByObject;

import org.junit.Test;

public class TestCases // extends TestReusableComponents

// Signature of the Object using Constructor

// Modifier   ClassName   objName = new Constructor(); // Here ClassName & Constructor Name are same but the diff is paranthess is given to constructor where as paranthess ins not given to ClassName 
// Constructor is a Method -for Methods we call them with paranthess

{
   // public TestReusableComponents trc = new TestReusableComponents();
//    public TestReusableComponents trc1 = new TestReusableComponents("Internet Explo");
    public TestReusableComponents trc2 = new TestReusableComponents("Internet Explo",95);

// From above constructors we can call any one based on the customer request .
    
	@Test
	public void composeAndSendmail()
	{
		System.out.println("Compose And Send Mail");
		trc2.launchApplication();
		trc2.logintoApplication();
		trc2.compose();
		trc2.send();
		trc2.logout();
		trc2.close();
		
	}
	
	@Test
	public void replymail()
	{
		System.out.println("Reply to The Mail");
		trc2.launchApplication();
		trc2.logintoApplication();
		trc2.open();
		trc2.reply();
		trc2.logout();
		trc2.close();
		
	}

}
