package conditionalStatement;

public class TernaryOperatorInNestedLoop {

	public static void main(String[] args) {
		int a=52;
		int b=23;
		int c=500;
		int d=0;
		d=a>b ? a>c ? a:c : b>c ? b:c;
		System.out.println(d);

	}

}
