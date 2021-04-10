package string;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=a;
		
		String reverse=new StringBuffer(a).reverse().toString();
		
		System.out.println(reverse);
		if(a==reverse)
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not Palindrome");
		}

	}

}
