import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t1=0;
		int t2=1;
		int next;
		for(int i=0;i<n;i++)
		{
			System.out.print(t1+" ");
			
			next=t1+t2;
			t1=t2;
			t2=next;
		}

	}

}
