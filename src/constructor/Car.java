package constructor;


// there is no main function here

public class Car 
{

	String name;
	 int speed;
	 String manufacturor;
	 static int wheels = 4;
	 
	 
	 // Default Constructor - is called when obj is created
	 
	 public Car(String name, int speed, String manufacturor)
	 {
		 this.name = name; // This will point to your instance variable
		 this.speed=speed;
		 this.manufacturor=manufacturor;
		 
		 
		 
	 }
	 
	 
	 
	 // constructor overloading
	 
	 public Car()
	 {
		 
		 
	 }
	 
	 
	 
	 
	 
	 public void drive()
	 {
		 //System.out.println("Drive Hyundai verna car a te speed of 90");
		
		 System.out.println("Drive" +  manufacturor+ "  " +name+ " car at speed of" +speed);
		 
	 }
	 
	public void accelarate()
	{
		//System.out.println("Drive Hyundai verna car a te speed of 90");
		
		System.out.println("Drive" +  manufacturor+ "  " +name+ " with" +wheels);
	
	}
	
	
}
