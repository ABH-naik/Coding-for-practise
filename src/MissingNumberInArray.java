public class MissingNumberInArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7};
        int n= arr.length;
        int sum=0;
        int totalSum=(n+1)*(n+2)/2;
        for(int i=0;i<n;i++)
        {
          sum =arr[i]+sum;

        }
        int missingNumber=totalSum-sum;
        System.out.println(missingNumber);
    }


}
