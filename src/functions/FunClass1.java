package functions;

public class FunClass1 {

	public static void main(String[] args) 
	{
		
		// function calling
		int add = sum(10,20);
		
		System.out.println(add);
		
		
		//sum(30,40);
		//sum(50,60);
		
		
	}	
		//Function /method - Signature - inside class - cannot define a function inside a function
	/*	
		public static void sum(int a , int b)
		{
			//int a=10;
			//int b=20;
			
			int sum=a+b;
			System.out.println(sum);
			
			//System.out.println(a+b);
		}
		
	*/	

	// now the function should return some value - return statement should be used
		
		public static int sum(int a , int b)
		{
			//int a=10;
			//int b=20;
			
			int sum=a+b;
			return sum;
			
						//	System.out.println(sum);
				
						//System.out.println(a+b);
		}

		
		// Non-Static method
		
		
}
