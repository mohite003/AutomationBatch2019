package constructor;

public class user {

	public static void main(String[] args)
	
	{
				// car 1
				
				Car Car1 = new Car("Hyundai",90,"Verna");
				//Car1.manufacturor="Hyundai";
				//Car1.name="Verna";
				//Car1.speed=90;
				//Car1.wheels=4;
				Car1.drive();
				Car1.accelarate();
		

				// car 2
		
				Car Car2 = new Car("Honda",120,"City");
				//Car2.manufacturor="Honda";
				//Car2.name="City";
				//Car2.speed=120;
				//Car2.wheels=4;
				Car2.drive();
				Car2.accelarate();
				
				
				// car 3
				
				Car Car3 = new Car("VM",140,"Vento");
				//Car3.manufacturor="VM";
				//Car3.name="Vento";
				//Car3.speed=140;
				//Car3.wheels=4;
				Car3.drive();
				Car3.accelarate();
				
				
				Car c = new Car();
				
				
		
	}

}
