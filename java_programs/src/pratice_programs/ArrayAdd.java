package pratice_programs;

import java.util.Scanner;

public class ArrayAdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row range of array");
		int x=sc.nextInt();
		System.out.println("enter column range of array");
		int y=sc.nextInt();
		int[][] a=new int[x][y];
		int[][] b=new int[x][y];
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++) {
				System.out.println("enter the value of a"+i+j);
				a[i][j]=sc.nextInt();
			}
		}
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++) {
				System.out.println("enter the value of b"+i+j);
				b[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("Addition of two matrices");
		
		
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++) {
				System.out.print(a[i][j]+b[i][j]+"    ");
			}
			System.out.println();
		}
		int[][] mul=new int[x][y];
		System.out.println("Multiplication of two matrices");
		if(x!=y) {
			System.out.println("multiplication of two matrices is not possible");
		}
		else {
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++) {
				for(int k = 0; k < x; k++) {
					mul[i][j]=mul[i][j]+a[i][k]*b[k][j];
				}
		      
			}
		}
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++)
			{
				System.out.print(mul[i][j]+"   ");
			}
			System.out.println();
		}
	  }
	}

}
