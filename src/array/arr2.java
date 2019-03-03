package array;

public class arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[][] str = new String[18][4];
		
		//Row 1
		str[0][0] = "Rakesh";
		str[0][1] = "Mohite";
		str[0][2] = "IMAGENESIS";
		str[0][3] = "Pune";
		
		//Row 2
		str[1][0] = "Aditya";
		str[1][1] = "Mohite";
		str[1][2] = "Bishops";
		str[1][3] = "Pune";
		
		
	/*	System.out.println(str[0][0]);
		System.out.println(str[1][0]);
		
		*/
		
		
		
		for(int r=0; r<str.length; r++)
		{
			for(int c=0; c<str[r].length; c++)
			{
				System.out.println(str[r][c]);
			}
		}
		
	}

}
