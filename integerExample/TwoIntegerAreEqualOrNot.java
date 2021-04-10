package integerExample;

import java.util.Scanner;

public class TwoIntegerAreEqualOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b)
		{
			System.out.println(a+" and "+b+" are Equal");
			
		}else
		{
			System.out.println(a+" and "+b+" are not Equal");
		}

	}

}
