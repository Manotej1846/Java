package Collection_Concepts;
import java.util.*;

public class Stack_Methods {

	public static void main(String[] args) {
		Stack<Object> s=new Stack<>();
		System.out.println(s.push("Manotej"));
		System.out.println(s.push("Kurnool"));
		System.out.println(s.push("Kumar"));
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.search("Manotej"));
		System.out.println(s.empty());
		System.out.println(s);
	}

}
