package oops;

public class Multilevel_inheritance {
	
	public static void station()
	{
		System.out.println("passengers to come and get in to the train");
	}
	public static void main(String[] args) 
	{
		station();
	}
  class Multilevel_inheritance1 extends Multilevel_inheritance
  {
	public static void run()
  {
	  System.out.println("passengers are travelling to their destinations");
  }
	public static void main(String[] args) {
		run();
		station();
			
	  }
  class Multilevel_inheritance2 extends Multilevel_inheritance1
  {
	  public static void destination()
	  {
		  System.out.println("Passengers reached the destination");
	  }
	  
	public static void main(String[] args) {
		station();
		run();
		destination();

	}
  }}}

