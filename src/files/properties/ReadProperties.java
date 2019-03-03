package files.properties;

import java.util.*;
import java.io.*;




public class ReadProperties {

	public static void main(String[] args)  
	{
		
		fun1();
		
		
		
		
	}
	
	
	
	// net user knows that the function ur using will throw this kind of Exception
	
	//Try Catch can also be used
	
	public static void fun1() throws IOException
	{
			
		
			
			Properties or = new Properties(); // propertied class
			
			FileInputStream file= new FileInputStream("/Users/imagenesis/Documents/Rakesh2019/Selenium Training/Eclipse/Testing/src/files/properties/ObjectRepositry.properties");
			
			
			
			
			or.load(file);
			
			System.out.println(or.getProperty("username1"));
		} 
		
		
		// it needs object of input string
		
	//	Thread.sleep(5000);
		
		//System.out.println(or.getProperty("username1"));
		
	}

