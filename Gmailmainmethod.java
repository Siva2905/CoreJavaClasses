package coreconcepts;

public class Gmailmainmethod {
	
	   public static void main(String[] args)
		{
		   System.out.println("TestCase Gmailmain method");
		   composeAndSendAnEmail();
		   replyAnEmail();
		   forwardAnEmail();
		   deleteAnEmail();
		   composeAndSendAnEmail();
		   replyAnEmail();
		   forwardAnEmail();
		   deleteAnEmail(); 
		}
	   
	   public static void composeAndSendAnEmail()
		{
		   System.out.println("TestCase composeAndSendAnEmail"); 
		}
	   public static void replyAnEmail()
	   {
		   System.out.println("TestCase replyAnEmail");
		}
	   public static void forwardAnEmail()
	   {
		   System.out.println("TestCase forwardAnEmail");
		}
	   public static void deleteAnEmail()
	   {
		   System.out.println("TestCase deleteAnEmail");
		}
	}