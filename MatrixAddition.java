package array;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int row=sc.nextInt();
		System.out.println("Enter Coloumns: ");
		int c=sc.nextInt();
		int[][] m1=new int[row][c];
		int[][] m2=new int[row][c];
		int[][] m=new int[row][c];
		System.out.println("Enter first matrix: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<c;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter second matrix: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<c;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Sum of matrix is : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<c;j++)
			{
				m[i][j]=m1[i][j]+m2[i][j];
				System.out.print(m[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
