package loop;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
//		int count=0;
//		while(n>0)
//		{
//			n=n/10;
//			count++;
//		}
//		System.out.println(count);

		int a=(int)Math.log10(n)+ 1;
		System.out.println(a);
	}

}
