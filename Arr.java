package array;

import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int[] a=new int[10];
//		
//		int[] a;
//		a=new int[10];
//		
//		int[] a,b;
		
//		int[] a=new int[100];
//		System.out.println(a[5]);
//		
		int[] age= {54,64,32,12,54,35,98,57,54};
		System.out.println(age[1]);
		double[] marks= {54.23,65.24,98.99,54.55
	};
		System.out.println(marks[2]);
		age[1]=989;
		for(int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
		}
	}
}
