package array;

import java.util.Scanner;

public class MultiplyMatrix {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rows");
		int rows=sc.nextInt();
		System.out.println("Enter coloumns: ");
		int c=sc.nextInt();
		int[][] m1=new int[rows][c];
		int[][] m2=new int[rows][c];
		int[][] m=new int[rows][c];
		System.out.println("Enter first matrix: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<c;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter second matrix: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<c;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<c;j++)
			{
				m[i][j]=0;    
				for(int k=0;k<c;k++)    
				{    
				m[i][j]+=m1[i][k]*m2[k][j];    
				}   
			}
		}
		System.out.println("Muliplication of matrix: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(m[i][j]+"  ");
			}System.out.println();
		}
		

	}

}
