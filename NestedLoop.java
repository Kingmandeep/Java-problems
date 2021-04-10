package conditionalStatement;

public class NestedLoop {

	public static void main(String[] args) {
		int a=2;
		int b=10;
		int c=5;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		}else {
			if(b>c)
			{
				System.out.println(b);
			}else {
				System.out.println(c);
			}
		}

	}

}
