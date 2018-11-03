package pratice_programs;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range of array");
		int n=sc.nextInt();
		int[] a= new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("enter the value of array index :"+i);
			a[i]=sc.nextInt();
		}
		System.out.println("Printing array from Right to Left");
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i]+" ");
		}

	}

}
