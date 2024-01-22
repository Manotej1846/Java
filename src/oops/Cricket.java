package oops;

public abstract class Cricket {
	
	abstract void India();
	abstract void Australia();
	abstract void England();
	abstract void Newzealand();

	public static void main(String[] args) 
	{
			
	}}
abstract class odi extends Cricket
{

	void Australia()
	{
		System.out.println("No 2 Odi Cricket team");
	}
	void England()
	{
		System.out.println("No 3 Odi Cricket team");
	}
	void Newzealand()
	{
		System.out.println("No 4 Odi Cricket team");
	}
	public static void main(String[] args) {
	}
    }
 class odi1 extends odi
{
	@Override
	void India() {
		System.out.println("No 1 Cricket Odi Team");	
	}
	public static void main(String[] args) {
     odi1 a1=new odi1();
     a1.India();
     a1.Australia();
     a1.England();
     a1.Newzealand();
}}


