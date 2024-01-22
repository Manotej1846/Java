package Basics;

public abstract class Class_A {
	 String s;
	abstract void m1();
	
	String m2() {
       System.out.println("m2 is calling");
		String s="maa";
		return s;	
	}	
	   void m3(String s)
		{
		   this.s=s;
    	System.out.println("m3 is calling"+s);
	}}		
	