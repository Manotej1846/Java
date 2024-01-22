package oops;

public class Person1 {

	private int age;

	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}

	public static void main(String[] args) {
		Person1 p=new Person1();
		p.setAge(32);
		System.out.println("My age is :" + p.getAge());

	}

}
