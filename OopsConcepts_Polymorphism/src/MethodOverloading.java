
public class MethodOverloading {
		void add(int x, int y)
		{
			System.out.println("Addition is:" +(x+y));
		}

		void add(int x, int y, int z)
		{
			System.out.println("Addition is:" +(x+y+z));
		}

		void add(int x, int y, int z, int q)
		{
			System.out.println("Addition is:" +(x+y+z+q));
		}
	

	public static void main(String[] args) {
		Addition object = new Addition();
		object.add(5,5);
		object.add(5,5,5);
		object.add(5,5,5,5);
		

	}

}
