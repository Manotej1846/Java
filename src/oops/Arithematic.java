package oops;

public interface Arithematic {
 public static final int a=10;
 public static final int b=20;
	public void add();
	public void sub();
public static void main(String[] args) {
	
}

class Arithematic1 implements Arithematic
{
	@Override
	public void add() {
		System.out.println("Addtion operation will do" + ":" + (a+b));
		
	}

	@Override
	public void sub() {
		System.out.println("Substraction will do" + ":" + (a*b));
		
	}
 public static void main(String[] args) {
	 Arithematic1 a=new Arithematic1();
	 a.add();
	 a.sub();		 
}
}}
