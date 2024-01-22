package oops;

public class Method_overloading {
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(byte c,byte d)
	{
		System.out.println(c-d);
	}
	public void add(long e,long f)
	{
		System.out.println(e+f);
	}
   public void add(long a,long b,long c)
   {
	   System.out.println(a+b+c);
   }
	public static void main(String[] args) {
		Method_overloading ml=new Method_overloading();
		ml.add(10,12);
		ml.add(10,30);
		ml.add(10,30);
		ml.add(10,10,20);

	}

}
