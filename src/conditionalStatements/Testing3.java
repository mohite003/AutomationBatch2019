package conditionalStatements;

public class Testing3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nested if 
		int a=40;
		int b= 20;
		int c= 30;
		if(a>b)
		{
			if(b>c)
			{
				System.out.println("a is greatest");
			}else if(a>c)
			{
				System.out.println("a is greatest");
			}
		}

	}

}
