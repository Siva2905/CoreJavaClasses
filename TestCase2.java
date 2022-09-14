package heairarchialInheritance;

import org.junit.Test;

//Heairarchial where 2 or more child classes (sub classes) will inheritate the properties of same parent class(super class)

//Test Case --2 is Child Class(sub class)
public class TestCase2 extends TestReusableComponents
{
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
