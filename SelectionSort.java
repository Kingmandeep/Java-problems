package array;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {3,1,-2,7,4,0};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int min=i;
			for(int j=i;j<n;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int t=a[i];
			a[i]=a[min];
			a[min]=t;
		}
		for(int item:a)
		{
			System.out.print(item+" ");
		}

	}

}
