package Basics;

import java.util.Scanner;
import java.io.*;

public class Common {
	static void starString(int n)
	{
		if(n==0) 
		{
			return;
		}
		System.out.println(n);
		starString(n-1);
		System.out.println(n-1);
	}
	public static void main(String[] args)
	{
		starString(3);
	}
}

//	public static void main(String[] args) {
//		String cars[]= {"Tata","Mahindra","Mitshubushi","Benz","Renault"};
//		{
//			for(String i:cars)
//			{
//				System.out.println(i);
//			}
//		}
//
//	}
//
//}
//		for(int i=0;i<10;i++)
//		{
//			if(i==4)
//			{
//				continue; // break;
//			}
//			System.out.println(i);
//			
//		}}}
//		
//---------- calling array value
//		String cars[]= {"Tata","Mahindra","Mitshubushi","Benz"};
//		System.out.println(cars[0]);
		
//------------Changing array value
//		String cars[]= {"Tata","Mahindra","Mitshubushi","Benz"};
//		cars[3]="BMW";
//		System.out.println(cars[3]);
//------------Lenght of an array
//		String cars[]= {"Tata","Mahindra","Mitshubushi","Benz"};
//		System.out.println(cars.length);
//------------- Array using for loop
//		String cars[]= {"Tata","Mahindra","Mitshubushi","Benz"};
//		for(int i=0;i<cars.length;i++)
//		{
//			System.out.println(cars[i]);	
//		}
//-------------Array using for each loop
//		String cars[]= {"Tata","Mahindra","Mitshubushi","Benz"};
//		for(String is:cars)
//		{
//			System.out.println(is);
//		}
//-----------Two dimensional array 
//		int [][] num= {{1,2,3},{4,5,6}};
//		System.out.println(num[1][2]);
//-----------Change of array using 2D
//		int [][] num= {{1,2,3,4},{5,6,7}};
//		num [1][2]=9;
//		System.out.println(num[1][2]);
//-----------2D using for loop
//		int[][] num= {{1,2,3},{4,5,6}};
//		for(int i=0;i< num.length;i++)
//		{
//			for(int j=0;j<num[i].length;j++)
//			{
//				System.out.println(num[i][j]);
//			}
//		}
//--------------Area of circle
//	Scanner s=new Scanner(System.in);
//	System.out.println("Enter the radius");
//	double r=s.nextDouble();
//	double area=(22*8*8);
//	System.out.println("Are of circle:"+area);
//--------------
//	}}







		