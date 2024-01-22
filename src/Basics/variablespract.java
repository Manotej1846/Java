package Basics;

public class variablespract {

	int s1=10;
	
	static String s="Manoj";
	
	public void m1()
	{
		System.out.println("m1 calling non-static");
	}
	
	public static void m2()
	{
		System.out.println("m2 is calling static");
		
	}
	
	public static void main(String[] args) {
		
		variablespract v=new variablespract();
		System.out.println("instance var :" + v.s1);
		
		variablespract.m2();
		
		v.m1();
		
		System.out.println("GLobal : " + variablespract.s);
		
	}

}
