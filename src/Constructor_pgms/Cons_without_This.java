package Constructor_pgms;

public class Cons_without_This {
	int Emp_id;
	int E_sal;
	String Emp_Name;
	String Emp_Class;
	String Emp_Desig;
	static String Emp_join_date;
	
	public Cons_without_This(int emp_id,int e_sal,String emp_Name,String emp_Class,String emp_Desig,String emp_join_date)
	{
		Emp_id=emp_id;
		E_sal=e_sal;;
		Emp_Name=emp_Name;
		Emp_Class=emp_Class;
		Emp_Desig=emp_Desig;
		Emp_join_date=emp_join_date;	
	}

	public static void main(String[] args) {
		//using ref1
		Cons_without_This E=new Cons_without_This(1234,50000,"kutti","bsc","accountant","10-10-1993");
		
		System.out.println(E.Emp_id);
		System.out.println(E.E_sal);
		System.out.println(E.Emp_Name);
		System.out.println(E.Emp_Class);
		System.out.println(E.Emp_Desig);
		System.out.println(Cons_without_This.Emp_join_date);
		
		//using ref2
		Cons_without_This E1=new Cons_without_This(123,60000,"manoj","EEE","Software","10-02-2024");
		
		System.out.println(E1.Emp_id);
		System.out.println(E1.E_sal);
		System.out.println(E1.Emp_Name);
		System.out.println(E1.Emp_Class);
		System.out.println(E1.Emp_Desig);
		System.out.println(Cons_without_This.Emp_join_date);

	}

}

