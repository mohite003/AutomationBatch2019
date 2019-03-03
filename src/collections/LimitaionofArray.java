package collections;

public class LimitaionofArray {

	public static void main(String[] args)
	{
		int a = 10;
		String str = "Anand";
		char gender = 'M';
		boolean status = true;
		
		//These needs to be stored in array , can we do it ??
		
		//object super class of all classes in JAVA and create object array
		
		Object[] obj = new Object[5];
		obj[0]=a;
		obj[1]=str;
		obj[2]=gender;
		obj[3]=status;
		
		obj[4]=new LimitaionofArray();
		
		


	}

}
