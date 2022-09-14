package inheritanceByObject;

public class TestReusableComponents

// Creating the constructor 
// Signature of constructor 

  // Modifier ClassName()
{
	//Modifier          ClassName()
	public             TestReusableComponents()
	{
		System.out.println("Clean the Data Base");
		System.out.println("Open Google Chrome Browser");
	}
	public TestReusableComponents(String Browser)
	{
		System.out.println("Clean the Data Base");
		System.out.println("Open Google "+ Browser);
	}
	public TestReusableComponents(String Browser,int version)
	{
		System.out.println("Clean the Data Base");
		System.out.println("Open Google "+ Browser + "With Version : "  +version);
	}
//--------------------------------------	 Reusable Components ------------------------------------
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
	}
	public void logintoApplication()
	{
		System.out.println("RC : Login To Application");
	}
	public void compose()
	{
		System.out.println("RC : Compose");
	}
	 void send()
	{
		System.out.println("RC : Send Mail");
	}
	public void reply()
	{
		System.out.println("RC : Reply to the Mail");
	}
	public void logout()
	{
		System.out.println("RC : Logout From Mail");
	}
	public void close()
	{
		System.out.println("RC : Close From Application");
	}
	public void open()
	{
		System.out.println("RC : Open Mail Application");
	}

}
