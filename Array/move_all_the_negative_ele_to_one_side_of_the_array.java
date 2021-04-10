public class move_all_the_negative_ele_to_one_side_of_the_array {
    static void arrange(int n,int arr[]){
        int t,j=0;
        for(int i=0;i<n;i++)
        {
            
            if(arr[i]<0)
            {
                if(i!=j)
                {
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;

                }
                j++;
                
            }
        }
    }
    static void print(int arr[]){
        for(int p:arr){
            System.out.print(p+"  ");
        }
    }
    public static void main(String[] args) {
        int arr[]={-1,2,-3,4,5,6,-7,8,9};
        int n=arr.length;
        arrange(n, arr);
        print(arr);

    }
}
