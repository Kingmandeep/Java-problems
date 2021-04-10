package oops;

public class MethodOverloding {

	public static void main(String[] args) {
		
		int d=maxOf(45,7);
		int e=maxOf(5,4,5);
		int f=maxOf(12);
		System.out.println();
		System.out.println(d);
		System.out.println();
		System.out.println(e);
		System.out.println();
		System.out.println(f);

	}
	static int maxOf(int a,int b,int c)
	{
		return a*b*c;
	}
	static int maxOf(int a,int b) {
		return a*b;
	}
	static int maxOf(int a) {
		for(int i=1;i<11;i++)
		{
			System.out.println(a*i+" ");
		}
		return 0;
	}

}
