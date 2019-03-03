package exceptions;

import java.util.*;


public class TryCatch {

	public static void main(String[] args)
	
	{
		try
		{
			//Arithmetic Exceptions
			
			int a = 10;
			int b = 0;
			
			System.out.println(a/b);
			
			//Null Pointer Exception
			
			Hashtable<String , String> table = new Hashtable<String , String>();
			//table.put(null, " Rakesh");
			//System.out.println(table.get(null));
			
			
			//String idex out of bound Expection
			
			String str = "R";
			System.out.println(str.charAt(1));
			
			Thread.sleep(5000);
			
			
			
			
		}
	/*catch(ArithmeticException e)
		
		{
			System.out.println("FAIL : Divident is Zero");
			
		}
		catch(NullPointerException e)
		
		{
			System.out.println("FAIL : user passed null kye in Hastable");
			
		} */
		
		catch(RuntimeException e)
		
		{
			System.out.println("FAIL : RUmtime Exception");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		catch(Exception e)
		{
			System.out.println("Continue the Execution after excpetion");
			
			// Suuper class of all checked exception
			
		}
		System.out.println("Continue the Execution after excpetion");

	}

}
