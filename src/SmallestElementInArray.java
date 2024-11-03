public class SmallestElementInArray {

        public static void main(String[] args) {
            int arr[]={85,25,33,405,51};
            int min=arr[0];
            for(int i=1;i< arr.length;i++) {
                if (arr[i] < min) {
                    min = arr[i];

                }
            }
            System.out.print(min);

        }
    }


