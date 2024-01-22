package Collection_Concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Methods {

	public static void main(String[] args) {
		List<Object> l=new ArrayList<Object>(); 
// add()		
		l.add("Ashok");
		l.add("Manoj");
		l.add("Sudharshan");
		l.add(0,"A.");
		System.out.println(l);
//addAll()
		List<Object>l1=new ArrayList<Object>();
		l1.add(34);
		l1.add(32);
		l1.add(29);
		System.out.println(l1.addAll(0, l));
		System.out.println(l1);
		System.out.println(l1.get(0)); //get()
		System.out.println(l1.set(0, "Mennakshi"));//set()
		System.out.println(l1);
		System.out.println(l1.indexOf("Manoj"));//indexOf()
		System.out.println(l1.lastIndexOf(29)); //lastIndexOf()
		
// Iterator
		ArrayList<String> s=new ArrayList<>();
		s.add("Sachin");
		s.add("Sehwag");
		s.add("Kohli");
		s.add("Rohit");
		s.add("SKY");
//Forward ListIterator
		ListIterator<String> st=s.listIterator();
//		System.out.println(st.hasNext());
//		System.out.println(st.next());
		while(st.hasNext())
		{
			System.out.println("Next Index value is :"+st.nextIndex());
			System.out.println("Element :" +st.next());
			
		}
//Backward List Iterator
		while(st.hasPrevious())
		{
			System.out.println("Next Index value is :"+st.previousIndex());
			System.out.println("Element :" +st.previous());
			
		}
		System.out.println("List Before Remove() :" +st);
	for(int i=0;i<=3;i++)
	{
		System.out.println(st.next());
	}
		System.out.println("List After Remove() :" +st);
	}
	}


