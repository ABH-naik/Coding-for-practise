public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[]={85,25,33,405,51};
        int max=arr[0];
        for(int i=1;i< arr.length;i++) {
            if (arr[i] < max) {
                max = arr[i];

            }
        }
            System.out.print(max);

    }
}
