package exceptions;

public class ThrowException {
	
	public static void main(String[] args)
	{
		
		int a = 10;
		int b = 20;
		
		if(a==b)
			
		{
			System.out.println("Number Matched");
			
		}else
		{
			throw new Exception("Number not matched a=" +a+"and b="+b);
			
		}
	}

}
