package array;

public class Ar {

	public static void main(String[] args) {
		
//		int a[][] =new int[5][3];
		int a[][] = {{2,3,4,5},{4,5,6,8},{8,7,9,2}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]+"  ");
			}System.out.println();
		}

	}

}
