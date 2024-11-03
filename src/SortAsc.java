public class SortAsc {
    public static void main(String[] args) {

        int arr[]={6,8,4,2,5};
        int temp;
        System.out.println("Elements of original array");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of sorted array");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
