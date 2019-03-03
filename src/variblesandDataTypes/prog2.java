package variblesandDataTypes;

public class prog2 {

	
	
	public static String country2 = "Canada";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		prog1 obj = new prog1();
				System.out.println(obj.city); // calling non-static variables by using object
				
				
				System.out.println(prog1.country);// calling static variables by using class name
				
				int a=3;
				int b=7;
				//+,-,*/,% - airthmetic operators
				
				System.out.println(a+b);
				System.out.println(a-b);
				System.out.println(a/b);
				System.out.println(a*b);
				System.out.println(b%a);
				
				a=b;
				System.out.println(a);
				System.out.println(b);
				//swap program
				
	}

}
