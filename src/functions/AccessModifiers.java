package functions;

public class AccessModifiers {

	public static void main(String[] args) 
	
	{
		AccessModifiers obj = new AccessModifiers();
		obj.publicMEthod();
		obj.privateMEthod();
		obj.noAccessMEthod();
		obj.protectedMEthod();
	}
	
	
	public void publicMEthod()
	{
	System.out.println("Public Method");
	}
	
	private void privateMEthod()
	{
	System.out.println("Private Method");
	}
	
	
	protected void protectedMEthod()
	{
	System.out.println("Proctected Method");
	}
	
	
	 void noAccessMEthod()
	{
	System.out.println("No Access Modifier Method");
	}

}
