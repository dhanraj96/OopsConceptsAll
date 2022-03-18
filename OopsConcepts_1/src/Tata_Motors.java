
public class Tata_Motors {
	int noCars;
	String Model;
	String engine = "3L Diesel";
	int Speed = 80;
	
	
	void display()
	{
		System.out.println("This is Tata Motors, Welcome to our Showroom");
	}
	void display1()
	{
		System.out.println("I am Apple iPhone");
	}


	public static void main(String[] args) {
		Tata_Motors object = new Tata_Motors();
		object.display();
		object.display1();
	
		System.out.println("The speed of car is:" +object.Speed);
		System.out.println("The type of Engine is:" +object.engine);
		

	}

}


