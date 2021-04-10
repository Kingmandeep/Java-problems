package list;

public class Pairs<X,Y>{
	
	X X;
	Y Y;
	public Pairs(X x,Y y) {
		this.X=x;
		this.Y=y;
		
	}
	public void getDescription() {
		System.out.println(X+" and "+Y);
	}
	

}
