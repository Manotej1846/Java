package Basics;

import java.util.Scanner;

public class MultiplicationTablee {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
          int m=sc.nextInt();
          int i=1;
     while (i<=m)
     {
    	 System.out.println(m+"*"+i+"="+(m*i));
    	 i++;
     }

	}

}
