//using for each
package Basics;

public class Matrixforeach {

	public static void main(String[] args) {
		int a[][]= { {2, 1, 3},{4, 5, 6},{7, 8, 9}};
		
		for (int[]i:a)
		{
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}


