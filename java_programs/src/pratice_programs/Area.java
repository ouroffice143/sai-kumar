package pratice_programs;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1----area of circle");
		System.out.println("2----perimeter of circle");
		System.out.println("3----area of triangle");
		System.out.println("4----perimeter of triangle");
		int x=sc.nextInt();
		switch(x) {
		case 1: System.out.println("enter radius");
		        double r=sc.nextDouble();
		        System.out.println("area of circle :"+(22/7.0)*r*r);
		        break;
		case 2:  System.out.println("enter radius");
        double r1=sc.nextDouble();
        System.out.println("perimeter of circle :"+2*(22/7.0)*r1);
        break;
		case 3:  System.out.println("enter base of triangle");
        double b=sc.nextDouble();
        System.out.println("enter base of triangle");
        double h=sc.nextDouble();
        System.out.println("area of triangle :"+(1/2)*b*h);
        break;
		case 4:  System.out.println("enter base of triangle");
        double b1=sc.nextDouble();
        System.out.println("enter base of triangle");
        double h1=sc.nextDouble();
        System.out.println("enter hypotenuse  value of triangle");
        double hy=sc.nextDouble();
        System.out.println("perimeter of circle :"+(b1+h1+hy));
        break;
        default: System.out.println("invalid input");
        	
		}
	
		

	}

}
