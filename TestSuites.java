package inheritanceByObject;

import org.junit.Test;

public class TestSuites extends TestCases
{
	
	@Test
	public void Smokesuite()
	{
		System.out.println("Test Case Smoke ");
		composeAndSendmail();
			}
	
	@Test
	public void regressionsuite()
	{
		System.out.println("Test Case Regression");
		replymail();
		
	}
	
}
