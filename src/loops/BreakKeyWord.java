package loops;

public class BreakKeyWord {

	public static void main(String[] args)
	
	{
		for(int i=1; i<100; i++)
			
		{
			
			if(i==50)
				break;
			
			// Never write a statement after a break or return 
			
			System.out.println(i);
		}

	}

}
