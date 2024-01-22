package Collection_Concepts;

import java.util.LinkedList;

public class Linkedlist_Methods {

	public static void main(String[] args) {
		LinkedList<Object> l=new LinkedList<>();
		l.add(50);
		l.add(100);
		l.add(150);
		l.add(200);
		l.add("Pen");
		l.add("Book");
		l.add("Pencil");
		l.add("Pad");
		l.add(4,250);
		System.out.println(l);
		l.addFirst(25);
		System.out.println(l);
		l.addLast("Sketch");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l);
		System.out.println(l.isEmpty());
	}
}
