package stringClass;

public class StringFunction {

	public static void main(String[] args)
	
	{
		String name = "   Rakesh   ";
		String name2 = "rakesh";
		
		String name3 = "Rakesh Mohite";
		
		String name4 = "RakeshVilasMohiteVilas$TechBodhiVilasPune";
		
		
		
		//Length
		
		int l = name.length();
		
		System.out.println(l);
		
		//character at particular index
		
		char c = name.charAt(0);
		
		System.out.println(c);
		
		System.out.println(name.equals(name2));
		
		System.out.println(name.equalsIgnoreCase(name2));
		
		//Trim  - removes start and end white spaces
		
		System.out.println(name);
		System.out.println(name.trim());
		
		
		//Sub String   - Begin Index and end Index
		
		System.out.println(name3.substring(6));
		System.out.println(name3.substring(0, 4));
		
		
		//Replace
		
		System.out.println(name3.replace("R", "K"));
		
		System.out.println(name3.replace(" ", "$"));
		
		System.out.println(name4.replace("Rakesh" ,  "Nitin"));
		
		System.out.println("----------------------");
		
		
		//Split
		
		String[] str=name4.split("Vilas");
		
		for(String s:str)
		{
			System.out.println(s);
		}
		
		
		
		String name5 ="Aditya";
		
		System.out.println(name5.length());
		
		System.out.println(name5.replace("A" ,  "").length());
		
		System.out.println((name5.length()) - (name5.replace("a", "").length()));
		
		
		
		
		
		
		
		
		
		

	}

}
