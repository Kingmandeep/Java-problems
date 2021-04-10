package switchCase;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter First Number: ");
//		int a=sc.nextInt();
//		System.out.println("Enter Operator: ");
//		char c=sc.next().charAt(0);
//		System.out.println("Enter Second Number: ");
//		int b=sc.nextInt();
//		
//		switch(c)
//		{
//		case '+':
//			System.out.println(a+" "+c+" "+b+" "+"= "+(a+b));
//			break;
//		case '-':
//			System.out.println(a+" "+c+" "+b+" = "+(a-b));
//			break;
//		case '*':
//			System.out.println(a+" "+c+" "+b+" = "+(a*b));
//			break;
//		case '/':
//			System.out.println(a+" "+c+" "+b+" = "+((float)a/b));
//			break;
//		case '%':
//			System.out.println(a+" "+c+" "+b+" = "+(a%b));
//			break;
//		default:
//			System.out.println("Invalid Operator");
//			break;
//		}
//		
		System.out.println("Enter rating: ");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
		case 2:
			System.out.println("Bad");
			break;
		case 3:
			System.out.println("average");
			break;
		case 4:
			System.out.println("good");
			break;
		case 5:
			System.out.println("Best");
			break;
		default:
			System.out.println("Please enter rating betwwn 1 to 5");
			break;
			
		}

	}

}
