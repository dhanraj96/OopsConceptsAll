class Seltos
{
private int Speed;
	private int getSpeed()
	{
		return Speed;
	}
	private void setSpeed(int speed)
	{
	  Speed = speed;
	}
}


public class Tata_Motors {
	int noCars;
	String Model;
	String engine = "3L Diesel";
	
	
	
	void display()
	{
		System.out.println("This is Tata Motors, Welcome to our Showroom");
	}
	void display1()
	{
		System.out.println("I am Apple iPhone");
	}

	public static void main(String[] args) {
	
		Seltos object = new Seltos();
		object.getSpeed();
		object.setSpeed(100);
		
	
		
		
		
		

	}

}
