package operator;
import java.util.Scanner;
import java.math.*;
public class ArithmaticOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=(a+b)*(a+b);
		float d=(float)a/b;
		int r=a%b;
	    int e=a++;
		System.out.println(c);
        System.out.println(d);
        System.out.println(d);
        System.out.println(a);
        System.out.println(e);
	}

}
