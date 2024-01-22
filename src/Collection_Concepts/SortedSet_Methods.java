package Collection_Concepts;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_Methods {

	public static void main(String[] args) {
		SortedSet<Integer>s=new TreeSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		System.out.println(s);
	
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(40));
		System.out.println(s.tailSet(50));
		System.out.println(s.subSet(10, 60));
		System.out.println(s.comparator());
	}

}
