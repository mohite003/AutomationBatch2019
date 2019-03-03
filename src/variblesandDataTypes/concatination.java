package variblesandDataTypes;

public class concatination {

	public static void main(String[] args)
	{
		String name = "Rakesh";
		String surname = "Mohite";
		int age=40;
		int bike = 1;
		
		
		System.out.println("My name is  " +name+ " " +surname);
		
		System.out.println(age+bike);
		System.out.println(name+ " " +surname+age+bike);
		System.out.println(name+ " " +surname+ (age+bike));
		
		System.out.println(age+bike+name+ " " +surname);

	}

}
