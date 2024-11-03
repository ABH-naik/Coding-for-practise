public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={3,7,1};
        System.out.println("Length of an array "+arr.length);
        System.out.println("Reverse of an array");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+ ",");
        }

    }
}
