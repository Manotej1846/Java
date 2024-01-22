package oops;

public abstract class Vehicle {
	
abstract void NoOfWheels();
	
public static void main(String[] args) {
}

}
class bike extends Vehicle
{
	void NoOfWheels() {
	System.out.println("2");
	}
	
	public static void main(String[] args) {
	bike b=new bike();
	b.NoOfWheels();

	}
}

