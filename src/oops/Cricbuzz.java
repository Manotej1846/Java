package oops;

public interface Cricbuzz {
 String Game="Cricket";
 public void mensOdiRankings();
 public void MensTestRankings();
 public static void main(String[] args) {
}
abstract class Cricket1 implements Cricbuzz
{
	public void mensOdiRankings()
	{
		System.out.println("India is No.01 Odi Rankings");
	}
}
class Cricket2 extends Cricket1
{
	@Override
	public void MensTestRankings() {
		System.out.println("India is No.01 test Rankings");
		
	}
public static void main(String[] args) {
	Cricket2 c=new Cricket2();
	c.mensOdiRankings();
	c.MensTestRankings();
//	System.out.println("variable"+ Game);
}
}}
