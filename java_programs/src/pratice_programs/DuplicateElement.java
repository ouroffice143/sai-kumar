package pratice_programs;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class DuplicateElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range of array");
		int n=sc.nextInt();
		int[] a= new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("enter the value of array index :"+i);
			a[i]=sc.nextInt();
		}
		//To eliminate repetitive output
		SortedSet<String> ss=new TreeSet<>();
		for(int i = 0; i < n; i++) {
			int count=0;
			for(int j = 0; j < n; j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>1)
			{
			  String s=a[i]+"----"+count;
			  ss.add(s);
			}
		}
		Iterator<String> itr=ss.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
