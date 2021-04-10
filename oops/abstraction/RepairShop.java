package oops.abstraction;

public class RepairShop {
	public static void repairCar(Car car) {
		System.out.println("Car is repaired");
	}
	
    public static void main(String[] args) {
		Wagnar w=new Wagnar();
		Oddi o=new Oddi();
		
		repairCar(w);
		repairCar(o);

	}

}
