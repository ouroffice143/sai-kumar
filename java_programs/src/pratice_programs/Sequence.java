package pratice_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range of array");
		int x=sc.nextInt();
		int[] a=new int[x];
		int[] b=new int[x];
		for( int i = 0; i < x; i++) {
			System.out.println("enter value for a"+i);
			a[i]=sc.nextInt();
		}
		//To sort given array in ascending order
		Arrays.sort(a);
		int count=0;
		int j=0;
		//storing odd values in array b
		for(int i = 0; i < x; i++) {
			if(a[i]%2==1) {
				b[j]=a[i];
				count++;
				j++;
			}
		}
		//storing even values in array b
		for(int i = x-1; i > 0; i--) {
			if(a[i]%2==0) {
				b[count]=a[i];
				count++;
			}
		}
		a=b;
	  for(int i = 0; i < x; i++) {
		  System.out.print(a[i]+" ");
	  }

	}

}
