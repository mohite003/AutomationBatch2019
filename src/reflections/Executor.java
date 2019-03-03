package reflections;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import files.excel.Xls_Reader;

public class Executor {

	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
	{
		Xls_Reader xl = new Xls_Reader("/Users/imagenesis/Documents/Rakesh2019/Selenium Training/UserLogin.xls");
		String str = xl.getCellData("Keywords", 1, 1);
		System.out.println(str);
		
		Xls_Reader xl1 = new Xls_Reader("/Users/imagenesis/Documents/Rakesh2019/Selenium Training/UserLogin.xls");
		
		String tcName=xl1.getCellData("Keywords" ,2, "TC_Name");
		
		System.out.println(tcName);
		
		
		String[] keywords=xl1.getCellData("Keywords" ,2, "Keywords").split(",");
		
		System.out.println(keywords);
		
		
		//Runtime dynamically create object
		
		Class c = Class.forName("reflections."+tcName);
		Object obj = c.newInstance();
		
		 Method m = c.getDeclaredMethod(keywords[1]);
		 m.invoke(obj);
		 
		

	}

}
