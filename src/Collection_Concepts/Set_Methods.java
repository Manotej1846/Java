package Collection_Concepts;

import java.util.HashSet;
import java.util.Set;

public class Set_Methods {

	public static void main(String[] args) {
		Set<Object> s=new HashSet<Object>();
		
		s.add("Dosa");
		s.add("Idli");
		s.add("Vada");
		s.add("Poori");
		s.add("Mysore Bonda");
		System.out.println(s);
		
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(30);
		s1.add(20);
		s1.add(35);
		s1.add(25);
		s1.add(30);
		s1.add(50);
		System.out.println(s1);
		
		System.out.println(s.addAll(s1));
		
		System.out.println(s);
		
		System.out.println(s1.size());
		System.out.println(s1.contains(50));
		System.out.println(s.containsAll(s1));
		System.out.println(s1.containsAll(s));
		System.out.println(s.toArray());
		System.out.println(s1.remove(50));
		System.out.println(s.removeAll(s1));
		System.out.println(s1.retainAll(s));
		System.out.println(s);
		s.clear();
		System.out.println(s);
		
		
		

	}

}
