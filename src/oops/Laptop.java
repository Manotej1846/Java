package oops;

public interface Laptop {
	public void Hp();
	public static void main(String[] args) {
		
	}
}
interface UsedOne
{
	public void acer();
	public static void main(String[] args) {
		
	}
}
class Laptop1 implements Laptop,UsedOne
{

	@Override
	public void acer() {
		System.out.println("Indian Based Product good to use for business purposes");
		
	}

	@Override
	public void Hp() {
		System.out.println("US baesd Product and good to use for students ");
		
	}
public static void main(String[] args) {
	Laptop1 l=new Laptop1();
	l.acer();
	l.Hp();
}
	
}