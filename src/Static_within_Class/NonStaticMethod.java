package Static_within_Class;

public class NonStaticMethod {

	void s()
	{
		System.out.println("Non Static Method");
	}
	static void s1()
	{
		NonStaticMethod v=new NonStaticMethod();
		v.s();
	}
	
	public static void main(String[] args) {
		NonStaticMethod v=new NonStaticMethod();
             v.s();
             s1();
	}

}
