package integerExample;

import java.util.Scanner;

public class IncrementByOneInGivenInteger {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int r,sum=0;
		while(a>0)
		{
			r=a%10;
			r++;
			sum=sum*10+r;
			a/=10;
		}int s=0;
		while(sum>0)
		{
			r=sum%10;
			s=s*10+r;
			sum/=10;
		}
		System.out.println(s);

	}

}
