public class DuplicateElements {
    public static void main(String[] args) {
        int arr[]={3,5,3,5,4};
        System.out.println("Duplicate Elements in an array");
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }

            }
        }
    }
}
