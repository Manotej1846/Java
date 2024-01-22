package Collection_Concepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Methods {

	public static void main(String[] args) {
		Collection<Object> c=new ArrayList<>();
		// add()		
		c.add(18);
		c.add(46);
		c.add("Manoj");
		c.add("Hyderabad");

		System.out.println(c);
		// addAll()
		Collection<Object> c1=new ArrayList<>();
		c1.add(25);
		c1.add(35);
		c1.add(18);
		c1.add(46);
		c1.add("Sadup Soft Tech Pvt Ltd");
		c1.add("Testing Enginner");
		// List<String> a=new ArrayList<String>();
		c1.addAll(c);
		System.out.println(c1);
		//retainAll()
		c.retainAll(c1);
		System.out.println(c);
		//remove()
		c.remove("Hyderabad");
		System.out.println(c);
		//removeAll()
		c1.removeAll(c);
		System.out.println("After removing:"+c1);
		//clear()
		c1.clear();
		System.out.println(c1);
		//isEmpty()
		System.out.println(c1.isEmpty());
		//size()
		System.out.println(c.size());
		//contains()
		System.out.println(c.contains("Manoj"));
		//containsAll()
		System.out.println(c1.containsAll(c));
		//toArray()
		System.out.println(c.toArray());
		//iterator()
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("TATA");
		cars.add("BENZ");
		cars.add("VOLVO");
		cars.add("TESLA");
		Iterator<String> st=cars.iterator();
		System.out.println(st.hasNext());
		System.out.println(st.next());
		//equals()
		Collection<Integer> s=new ArrayList<Integer>();
		Collection<Integer> s1=new ArrayList<Integer>();
		s.add(25);
		s.add(26);
		s1.add(25);
		s1.add(26);
		System.out.println(s.equals(s1));   
	}	
}

