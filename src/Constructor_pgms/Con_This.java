package Constructor_pgms;

public class Con_This {
	
	int Emp_id;
	int E_sal;
	String Emp_Name;
	String Emp_Class;
	String Emp_Desig;
	static String Emp_join_date;
	
	Con_This(int Emp_id,int E_sal,String Emp_Name,String Emp_Class,String Emp_Desig,String Emp_join_date)
	{
		this.Emp_id=Emp_id;
		this.E_sal=E_sal;;
		this.Emp_Name=Emp_Name;
		this.Emp_Class=Emp_Class;
		this.Emp_Desig=Emp_Desig;
		Con_This.Emp_join_date=Emp_join_date;	
	}

	public static void main(String[] args) {
		//using ref1
		Con_This E=new Con_This(1234,50000,"kutti","bsc","accountant","10-10-1993");
		
		System.out.println(E.Emp_id);
		System.out.println(E.E_sal);
		System.out.println(E.Emp_Name);
		System.out.println(E.Emp_Class);
		System.out.println(E.Emp_Desig);
		System.out.println(Con_This.Emp_join_date);
		
		//using ref2
        Con_This E1=new Con_This(123,60000,"manoj","EEE","Software","10-02-2024");
		
		System.out.println(E1.Emp_id);
		System.out.println(E1.E_sal);
		System.out.println(E1.Emp_Name);
		System.out.println(E1.Emp_Class);
		System.out.println(E1.Emp_Desig);
		System.out.println(Con_This.Emp_join_date);

	}

}
