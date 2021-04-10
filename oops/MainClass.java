package oops;

class Cat{
	boolean hasFur;
	String color,bread;
	int legs,eyes;
	public void walk() {
		System.out.println("Cat is Walking");
	}
	public void eat() {
		System.out.println("Cat is Eating a fish");
	}
	public void description() {
		System.out.println("My cat has "+legs+" legs and "+eyes+" eyes");
	}
}
class Dog{
	boolean veg;
	String color,bread;
	int legs,eyes;
	
	public void about()
	{
		System.out.println("Color is: "+color);
		System.out.println("Dog has "+legs+" legs and "+eyes+" eyes");
	}
	public void main()
	{
		System.out.println(bread);
	}
}
public class MainClass {

	public static void main(String[] args) {
		Cat cat1 =new Cat();
		Cat cat2=new Cat();
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		Dog dog3=new Dog();
		cat1.walk();
		cat2.eat();
		cat1.legs=3;
		cat2.legs=4;
		cat1.eyes=2;
		cat2.eyes=3;
		cat1.description();
		cat2.description();
		dog1.eyes=3;
		dog2.eyes=2;
		dog3.eyes=1;
		dog3.legs=4;
		dog2.bread="German";
		dog1.bread="teady";
		dog3.bread="stifen";
		dog2.legs=3;
		dog1.legs=4;
		dog1.color="Red";
		dog2.color="black";
		dog3.color="white";
		dog1.main();
		dog1.about();
		dog2.about();
		dog3.main();
		dog3.about();
		

	}

}
