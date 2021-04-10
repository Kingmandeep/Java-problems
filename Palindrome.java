package loop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
		int r;
		int sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n/=10;
		}
		String d=(a==sum) ? "Palindrome":"Not Palindrome";
		System.out.println(d);

	}

}
