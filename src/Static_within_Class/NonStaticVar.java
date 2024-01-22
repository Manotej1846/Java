package Static_within_Class;

public class NonStaticVar {
	
	String a="Sadup";
		void m1()
		{
			System.out.println(a);
		}
		static void m2()
		{
			NonStaticVar v=new NonStaticVar();
			System.out.println(v.a);
		}

	public static void main(String[] args) {
		NonStaticVar v=new NonStaticVar();
		v.m1();
		m2();
		
		}
	}
		
