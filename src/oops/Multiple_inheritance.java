package oops;

public class Multiple_inheritance {
	
//	class A
//	{
//		void m()
//		{
//			int a=10;
//			int b=20;
//			int c=a+b;
//			System.out.println(c);
//		}
//		class b
//		{
//			void m1()
//			{
//				int a=20;
//				int b=30;
//				int c=a*b;
//				System.out.println(c);
//			}
////		abstract class c extends a,b
////		{
////			c c1=new c();
////			c1.m1();
////		}
////		}
////	}
//
////	public static void main(String[] args) {
////		A c1=new A();
////		c1.m1();
////		c1.m();
////
////	}
////
////}
////	}}

	static void checkAge(int age)
	{
		if(age>18)
		{
			System.out.println("Access denied");
		}else
		{
			System.out.println("Access Granted");
		}}
		public static void main(String[] args)
		{
			checkAge(21);
		}
	}
	