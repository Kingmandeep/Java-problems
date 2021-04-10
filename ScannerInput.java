package userInput;
import java.util.Scanner;
public class ScannerInput {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Amount: ");
		int a=scan.nextInt();
		System.out.println("Enter Rate: ");
		float r=scan.nextFloat();
		System.out.println("Enter Time: ");
		int t=scan.nextInt();
		
		float p=a*r*t/100;
		System.out.println("Simple interest is: "+p);

	}

}
