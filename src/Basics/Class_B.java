package Basics;

public class Class_B extends Class_A{

	@Override
	void m1() {
		System.out.println("m1 is calling");
	}
	
	public static void main(String[] args) {
		Class_A cd=new Class_B();
		cd.m1();
		cd.m2();
		cd.m3("manoj");
	}

}
