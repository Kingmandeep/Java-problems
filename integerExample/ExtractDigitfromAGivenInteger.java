package integerExample;

import java.util.Scanner;

public class ExtractDigitfromAGivenInteger {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int count = 0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		while(m>0)
		{
			int a=m%10;
			System.out.println(count+" : "+a);
			m/=10;
			count--;
		}

	}

}
