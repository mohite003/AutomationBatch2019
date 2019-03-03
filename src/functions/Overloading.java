package functions;

public class Overloading {

	public static void main(String[] args)
	
	{
		sum(10,20);
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));

	}
	
	
	public static int sum(int a , int b) 
	{
		
		
		return  a+b;
		
	}
	
	
	public static int sum(int a , int b, int c)
	{
		
		
		return  a+b+c;
		
	}
	
	
	//swapping the parameters and data type shld also be diff
	
/*	public static void message(String name , int age) 
	{
		
		
		
	}
	public static void message(int age, String name) 
	{
		
		
		
	} */
	
	//negative scenarios - changing access modifiers , nature and retrun type
	
	/*public static void message(String name , int age) 
	{
		
		
		
	}
	 public static  int  message(String name , int age) 
	{
		return 10;
		
		
		
	} */
	
	
	/
	
	
	
	
}
