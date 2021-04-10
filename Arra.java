package array;

import java.util.Scanner;

public class Arra {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter no. of student: ");
		int n=sc.nextInt();
		float [] marks=new float[n];
		float sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the marks: ");
			marks[i]=sc.nextFloat();
			sum+=marks[i];
		}
		
		System.out.println((float)sum/n);
		
		
		

	}

}
