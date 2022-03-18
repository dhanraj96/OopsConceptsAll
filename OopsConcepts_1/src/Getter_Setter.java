
public class Getter_Setter {
	int noCars;
	String Model;
	String engine = "3L Diesel";
	int Speed;
	
	
	
	
	public int getSpeed()
	{
		return Speed;
	}
	public void setSpeed(int speed)
	{
		Speed = speed;
	}



	
	void display()
	{
		System.out.println("This is Tata Motors, Welcome to our Showroom");
	}
	void display1()
	{
		System.out.println("I am Apple iPhone");
	}



	public static void main(String[] args) {
		Getter_Setter object = new Getter_Setter();
		object.display();
		object.display1();
		object.setSpeed(100);
		System.out.println(object.getSpeed());
	
		
		

	}

	}


