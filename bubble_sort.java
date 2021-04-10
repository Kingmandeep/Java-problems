
public class bubble_sort {

	public static void main(String[] args) {
		
		int a[]= {2,5,-7,-9,-5,0,4,6,35,88,2,3,-1};
		int n=a.length;
		for(int i=1;i<n;i++)
		{
			
			for(int j=0;j<i;j++)
			{
				if(a[j]>a[i])
				{
					int temp = a[j];
					a[j]=a[i];
					a[i]=temp;
					
					
				}
				
				
			}
			
			
		}
		for(int i:a)
		{
			System.out.print(i+"  ");
		}

	}

}
