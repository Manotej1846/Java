package Collection_Concepts;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linked_HashSet_Methods {

	public static void main(String[] args) {
		LinkedHashSet<Object> l=new LinkedHashSet<Object>();

		l.add("Apple");
		l.add("Motorola");
		l.add("Samsung");
		l.add("Nokia");
		l.add("Vivo");
		l.add("Oppo");
		l.add("Redmi");
		l.add("Oneplus");
		l.add("Oppo");
		System.out.println(l);

		HashSet<Object> l1=new LinkedHashSet<Object>();

		l1.add(150000);
		l1.add(35000);
		l1.add(100000);
		l1.add(30000);
		l1.add(25000);
		l1.add(20000);
		l1.add(15000);
		l1.add(45000);
		l1.add(20000);
		System.out.println(l1);
		
		System.out.println(l1.addAll(l));
		System.out.println(l1.size());
		System.out.println(l1.contains(20000));
		System.out.println(l.containsAll(l1));
		System.out.println(l1.toArray());
		System.out.println(l.remove("Oppo"));
		System.out.println(l1.removeAll(l));
		System.out.println(l1.removeAll(l));
		System.out.println(l1);
		l1.clear();
		System.out.println(l1);
	}

}
