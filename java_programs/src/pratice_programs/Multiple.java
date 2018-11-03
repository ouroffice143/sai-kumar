package pratice_programs;

import java.util.Scanner;

public class Multiple {
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
   		System.out.println("enter the range of array");
   		int n=sc.nextInt();
   		int[] a= new int[n];
   		for(int i = 0; i < n; i++) {
   			System.out.println("enter the value of array index :"+i);
   			a[i]=sc.nextInt();
   		}
   		System.out.println("Multiples of 3 in the given array");
   		for(int i = 0; i < n; i++) {
   			if(a[i]%3==0) {
   				System.out.println(a[i]);
   			}
   		}
	}
}
