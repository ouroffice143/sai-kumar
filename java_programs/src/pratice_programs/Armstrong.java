package pratice_programs;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 int c=0,a,x;
    	 System.out.println("enter a number");
    	    String s=sc.next();
    	    int l=s.length();
    	
    	    int n=Integer.parseInt(s);
    	    x=n;
    	   
    	    while(n>0)  
    	    { 
    	    	 int a1=1;
    	    	int l1=l;
        	    a=n%10; 
    	        System.out.println(a);
    	       n=n/10;
    	       while(l1>0){
    	    	a1=a1*a;
    	    	l1--;
    	    }
    	    c=c+a1;  
    	    }
    	    if(x==c)  
    	    System.out.println(x+" is a armstrong number");   
    	    else  
    	        System.out.println(x+" is not armstrong number");   
    	   
	}
}
