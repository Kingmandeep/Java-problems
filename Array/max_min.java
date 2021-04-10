public class max_min {
    public static void main(String[] args) {
        int arr[]={4,8,99,75,68,45,24,35,98,75,34,1000,11,445,1,330,3000};
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]>arr[i])
                {
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println("Minimum Number is : "+arr[0]);

        System.out.println("Maximum Number is : "+arr[arr.length-1]);
        
        
    }
    
}
