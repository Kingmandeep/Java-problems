import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=true;
		if(n>1)
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
			}
		}else if(n==1) {
			flag=true;
		}else {
			flag =false;
		}
		
		if(flag)
		{
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}

	}

}
