package multilevelInheritanceByExtends;

import org.junit.Test;

   //   
  //             Child Class (sub class)               Parent class(super class)
public class TestCases  extends TestResuableComponents
{
	@Test
	public void composeAndsendmail()
	{
		System.out.println("Test case : composeAndsendmail(); ");
		launchApplication();
		logintoApplication();
		compose();
		send();
		logout();
		close();
	}
	@Test
	public void replyTomail()
	{
		System.out.println("Test Case : Reply To Mail");
		launchApplication();
		logintoApplication();
		open();
		reply();
		logout();
		close();
	}
	
	@Test
	public void forwardmail()
	{
		System.out.println("Test Case : Forward Mail");
		launchApplication();
		logintoApplication();
		open();
		forward();
		logout();
		close();
	}
	
	@Test
	public void deletemail()
	{
		System.out.println("Test Case : Delete mail");
		launchApplication();
		logintoApplication();
		open();
		delete();
		logout();
		close();
		
	}

}
