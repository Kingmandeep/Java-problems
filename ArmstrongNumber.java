import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r,sum=0;
		int a=n;
	    
		
		
		
		if(n>10)
		{
			while(n>0)
			{
				r=n%10;
				sum=sum+(int)Math.pow(r,3 );
				n=n/10;
			}
			if(a==sum)
			{
				System.out.println("Armstrong Number");
			}else
			{
				System.out.println("Not Armstrong");
			}
		}else if(n>0 && n<10)
		{
			System.out.println("Armstrong Number");
		}else
		{
			System.out.println("Not Armstrong");
		}
		

	}

}
