package loop;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=12;
		do {
			System.out.println(n*i);
			i++;
		}while(i<11);

	}

}
