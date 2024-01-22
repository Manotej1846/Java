package Constructor_pgms;

public class Constructor_Emp {

	int Emp_id;
	int E_sal;
	String Emp_Name;
	String Emp_Class;
	String Emp_Desig;
	String Emp_join_date;
	
	public static void main(String[] args) {
		//Called by 1st ref variable		
		Constructor_Emp E=new Constructor_Emp();
		E.Emp_id=2347255;
		E.E_sal=50000;
		E.Emp_Name="Manoj";
		E.Emp_Class="ECE";
		E.Emp_Desig="Student";
		E.Emp_join_date="09-jnuly-1991";
		
	System.out.println(E.Emp_id);
	System.out.println(E.E_sal);
	System.out.println(E.Emp_Name);
	System.out.println(E.Emp_Class);
	System.out.println(E.Emp_Desig);
	System.out.println(E.Emp_join_date);
	
	//Called by 2st ref variable	
	
	Constructor_Emp E1=new Constructor_Emp();
	E1.Emp_id=14275;
	E1.E_sal=56000;
	E1.Emp_Name="Ashok";
	E1.Emp_Class="EEE";
	E1.Emp_Desig="Student";
	E1.Emp_join_date="21-March-1991";
	
	System.out.println(E1.Emp_id);
	System.out.println(E1.E_sal);
	System.out.println(E1.Emp_Name);
	System.out.println(E1.Emp_Class);
	System.out.println(E1.Emp_Desig);
	System.out.println(E1.Emp_join_date);
		
	}

}
