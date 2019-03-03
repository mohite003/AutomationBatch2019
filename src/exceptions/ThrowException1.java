package exceptions;

public class ThrowException1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
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
