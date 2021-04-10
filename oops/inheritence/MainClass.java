package oops.inheritence;

public class MainClass {

	public static void main(String[] args) {
		
		Teacher t=new Teacher();
		t.name="Mandeep";
		t.eat();
		
	    t.laughing();
		t.teach();
		System.out.println();
		System.out.println();
		Singer s= new Singer();
		s.name="King";
	    
		s.eat();
		s.singer();

	}

}
