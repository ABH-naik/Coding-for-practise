import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        int num=153,rem,arm=0,c;
        c=num;
        while(num>0)
        {
            rem=num%10;
           arm= rem*rem*rem + arm;
           num=num/10;
        }
        if(c==arm)
            System.out.println("Armstrong number");
        else
            System.out.println("Not a Armstrong number");
    }
}
