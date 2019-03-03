package functions;

public class nonStaticMethods {

	public static void main(String[] args)
	
	{
	
		// cannot do this as cannot call non static method in static method
		//instance methods and instance methods and variables and can be called only thru objects
		// so need to create a object
		
		//	sum(10,20);
		
		// creation of object
		nonStaticMethods obj = new nonStaticMethods();
		
		obj.sum(10 , 20);
		
		
		
		

		
		

	}

	
	// here static keyword is not used
	
	public int sum(int a , int b)
	{
		
		return a+b;
		
	}
}
