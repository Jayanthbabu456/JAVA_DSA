// Sum Of A Digits Of Number
package conditionalsandloops.sumofdigits;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int sum=0;
        while(num!=0){
           int rem=num%10;
           sum=sum+rem;
           num=num/10;

        }
        System.out.println(sum);
        input.close();
    }
}
