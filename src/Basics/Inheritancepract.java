package Basics;

public class Inheritancepract {
	
	long accno=123465416465l;
	String name="Manoj";
	String ifsc="SBIN0004409";
	
	public  void bank()
	{
		System.out.println("welcom to bank");
	}
	
	public  void rbi()
	{
		System.out.println("welcom to rbi bank");
	}
	
public static class My extends Inheritancepract
{
	@Override
	public void bank()
	{
		System.out.println("welcome to sbi bank");
	}
}
	
	public static void main(String[] args) {
		My m1=new My();
		m1.bank();
	}

	}


