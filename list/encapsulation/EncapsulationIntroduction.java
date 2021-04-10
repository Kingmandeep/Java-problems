package encapsulation;

public class EncapsulationIntroduction {

	public static void main(String[] args) {
		Student obj = new Student();
//		obj.name="Mandeep";
		obj.setAge(22);
		System.out.println(obj.getAge());

	}

}
