package Static_within_Class;

public class staticvar {
	
	static String s="static variable";
	
 void man()
 {
	 System.out.println(s);
 }
 static void man1()
 {
	System.out.println(s);
 }

	public static void main(String[] args) {
		staticvar a=new staticvar();
		a.man();
		man1();

}
}

