package Static_within_Class;

public class Staticmethod {

	static void man()
	{
		System.out.println("static method");
	}
	void man1()
	{
		man();
	}
//	static void man2()
//	{
//		man();
//	}
	
	public static void main(String[] args) {
		Staticmethod s=new Staticmethod();
		s.man1();
//		man2();
	}

}
