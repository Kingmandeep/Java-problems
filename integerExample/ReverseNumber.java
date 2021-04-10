package integerExample;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int r,sum=0;
		while(a>0)
		{
			r=a%10;
			sum=sum*10+r;
			a=a/10;
		}
		System.out.println(sum);

	}

}
