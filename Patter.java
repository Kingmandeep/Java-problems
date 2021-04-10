package patterns;

import java.util.Scanner;

public class Patter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("*");
		for(int i=2;i<=n;i++)
		{
			System.out.print("* ");
			
			for(int j=3;j<=i;j++)
			{
				System.out.print("   ");
			}
			System.out.print(" * ");
			
			System.out.println();
		}
		if(n>1)
		{
			for(int i=1;i<=n;i++)
			{
				System.out.print("* ");
				System.out.print("  ");
			}
			System.out.println();

		}
		
	}

}
