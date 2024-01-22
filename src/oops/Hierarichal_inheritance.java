package oops;

public class Hierarichal_inheritance {
	public static void station()
	{
		System.out.println("passengers to come and get in to the train");
	}
	public static void main(String[] args)
	{
		station();
	}
	class Hierarichal_inheritance1 extends Hierarichal_inheritance
	  {
		public static void run()
	  {
		  System.out.println("passengers are travelling to their destinations");
	  }
		public static void main(String[] args) {
			run();
			station();
				
		  }
	  class Hierarichal_inheritance2 extends Hierarichal_inheritance1
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
       class Hierarichal_inheritance3 extends Hierarichal_inheritance2
       {
    	   public static void interchange()
 		  {
 			  System.out.println("Passengers pics another tarin");
 		  }
 		  
 		public static void main(String[] args) {
 			station();
 			run();
 			destination();
 			interchange();
 			} 
       }}}}