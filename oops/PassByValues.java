package oops;

import java.util.Scanner;

public class PassByValues {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of marks: ");
		int n=sc.nextInt();
		int[] p=new int[n];
		int[] q=new int[n];
		System.out.println("Enter First marks: ");
		for(int i=0;i<n;i++)
		{
			p[i]=sc.nextInt();
		}
		System.out.println("Enter Second marks: ");
		for(int i=0;i<n;i++)
		{
			q[i]=sc.nextInt();
		}
		System.out.println("Swap of first and second number is: ");
		for(int i=0;i<n;i++)
		{
			swap(p[i],q[i]);
		}
		System.out.println("Your old Number is: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(p[i]+"  "+q[i]);
		}
		

	}
	static void swap(int a,int b) {
		int t=a;
		a=b;
		b=t;
		System.out.println(a+"  "+b);
	}

}
