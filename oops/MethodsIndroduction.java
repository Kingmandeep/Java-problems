package oops;

public class MethodsIndroduction {

	public static void main(String[] args) {
		
		int f=34;
		int s=23;
		int result=maxOf(f,s);
		int d=maxOf(100,200);
		int e=maxOf(546,359);
		sayHi();
		System.out.println(result);
		System.out.println(d);
		System.out.println(e);
		sayHi();

	}
	static int maxOf(int a,int b) {
		return a>b ? a:b;
	}
	static void sayHi() {
		System.out.println("Hello");
		System.out.println("Good Morning");
	}
}
