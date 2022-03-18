class parent
{
	void add(int x, int y)//parent
	{
		System.out.println("Addition from Parent:" +(x+y));
	}
}

public class Addition extends parent {
void add(int x, int y)//child
	{
	//super.add(5,5);
		System.out.println("Addition from Child:" +(x+y));
	}

	public static void main(String[] args)
	{
		Addition object = new Addition();
		object.add(5,5);
		
	}
}




	


