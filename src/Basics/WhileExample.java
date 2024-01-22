package Basics;

import java.util.Scanner;

public class WhileExample {

    public static void main(String[] args) {
    	
    // Natural Numbers 0 to n Asc
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int targetNumber = sc.nextInt();
        int i = 1; // Start from 1 or any other initial value

        while (i <= targetNumber) {
            System.out.println(i);
            i++; // Increment i in each iteration
        }
        
     // Natural Numbers n to 0 Dsc   
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int targetNumber1 = sc.nextInt();
        int j=targetNumber1;
        while (j >= 0) {
            System.out.println(j);
            j--; 
        }
    }
}

