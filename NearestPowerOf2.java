import java.util.Scanner;

public class NearestPowerOf2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=1;
		while(n>p)
		{
			p=p*2;
		}
		System.out.println(p);
	}

}
