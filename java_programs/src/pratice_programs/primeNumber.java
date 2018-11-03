package pratice_programs;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int p=sc.nextInt();
		int i=2;
		boolean flag=false;
		while(i<=p/2) {
			if(p%i==0) {
				flag=true;
				break;
			}
			i++;
		}
		if(flag==true) {
			System.out.println(p+" is not a prime number");
		}
		else {
			System.out.println(p+" is a prime number");
		}
	}

}
