import java.util.Scanner;

public class sort_the_array_without_using_sorting_algo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]>arr[i])
                {
                    int r=arr[j];
                    arr[j]=arr[i];
                    arr[i]=r;
                }
            }
        }
        for(int t:arr)
        {
            System.out.print(t+"  ");
        }
    }
    
}
