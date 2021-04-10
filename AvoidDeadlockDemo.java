
public class AvoidDeadlockDemo {
	public void method1() {
		synchronized(Integer.class) {
			System.out.println("Aquired lock on Integer.class object");
			
			synchronized(String.class) {
				System.out.println("Aquired lock on String.class object");
			}
		}
	}
	public void method2() {
		synchronized(Integer.class) {
			System.out.println("Aquired lock on Integer.class Object");
			synchronized(String.class) {
				System.out.println("Aquired look on String.class object");
			}
		}
	}

}
