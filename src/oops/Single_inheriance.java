package oops;

public class Single_inheriance {
	
	public static void station()
	{
		System.out.println("passengers to come and get in to the train");
	}
	public static void main(String[] args)
	{
		station();
	}
}
class Single_inheriance1 extends Single_inheriance
{
	public static void destination()
	{
	System.out.println("passengers reached destination");
}
	public static void main(String[] args) {
		station();
		destination();
	}
	}

