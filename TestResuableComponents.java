package multilevelInheritanceByExtends;

// Access modifiers differences ,They are private , Public , default,Protected
 
                       // Parent Class (Super class)
public class TestResuableComponents 
{
     void launchApplication()
    {
    	System.out.println("RC: Launch Application");
    }
     void logintoApplication() 
    {
    	System.out.println("RC : Loginto Application");
    }
    void compose()// without any modifier is taken as default modifier
    {
    	System.out.println("RC : compose");
    }
    protected void send()
    {
    	System.out.println("RC : Send the Mail");
    }
    public void open()
    {
    	System.out.println("RC : Open the mail");
    }
    public void reply()
    {
    	System.out.println("RC : Reply to mail");
    }
    public void logout()
    {
    	System.out.println("RC : Logout");
    }
    public void close()
    {
    	System.out.println("RC : Close");
    }
    public void forward()
    {
    	System.out.println("RC : Forward the Mail");
    }
    public void delete()
    {
    	System.out.println("RC : Delete the Mail");
    }
}
