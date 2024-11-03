public class Palindrome {
    public static void main(String[] args) {
        int num=153,rem,sum=0,c;
        c=num;

        while(num>0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(c==sum)
        System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome number");
    }
}
