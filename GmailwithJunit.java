package coreconcepts;

import org.junit.Test;

public class GmailwithJunit 
{//-------------------------------------------Test Suites---------------------------------------
	
	@Test
	public void smokeSuite() // Build Validation Test (BVT)
	{
		System.out.println("Test Suite : SMOKE ");
		composeAndSendAnEmail();
		replyAnEmail();
		
	}
	@Test
	public void regression()
	{
		System.out.println("Test Suite : Regression");
		composeAndSendAnEmail();
		replyAnEmail();
		forwardAnEmail();
		deleteAnEmail();
			
		}
	
	//----------------------------------------Test Cases-------------------------------------------
	@Test
	public void composeAndSendAnEmail()
	{
		System.out.println("TestCase composeAndSendAnEmail");
		// Launch , LogInto , compose , Send , Logout , Close
		launchApplication();
		logintoApplication();
		compose();
		send();
		logout();
		close();
	}

	@Test
	public void replyAnEmail() 
	{
		System.out.println("TestCase replyAnEmail");
		// Launch , LogInto , Open , Reply , Logout , Close

		launchApplication();
		logintoApplication();
		open();
		reply();
		logout();
		close();
	}

	@Test
	public void forwardAnEmail() {
		System.out.println("TestCase forwardAnEmail");
		// Launch , LogInto , Open , Forward , Logout , Close

		launchApplication();
		logintoApplication();
		open();
		forward();
		logout();
		close();
	}

	@Test
	public void deleteAnEmail() {
		System.out.println("TestCase deleteAnEmail");
		// Launch , LogInto , Open , Delete , Logout , Close

		launchApplication();
		logintoApplication();
		open();
		delete();
		logout();
		close();
	}

	// ------------------------------RC - Reusable component-------------------------------
	public void launchApplication() {
		System.out.println(" RC : Launch Application");
	}

	private void logintoApplication() {
		System.out.println(" RC : Log into Application");
	}

	public void compose() {
		System.out.println(" RC : Compose");
	}

	public void open() {
		System.out.println(" RC : Open");
	}

	public void send() {
		System.out.println(" RC : Send");
	}

	public void logout() {
		System.out.println(" RC : Logout");
	}

	public void close() {
		System.out.println(" RC : Close");
	}

	public void reply() {
		System.out.println(" RC : Reply");
	}

	public void forward() {
		System.out.println(" RC : Forward");
	}

	public void delete() {
		System.out.println(" RC : Delete");
	}

}
