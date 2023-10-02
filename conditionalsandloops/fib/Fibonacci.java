// To calculate Fibonacci Series up to n numbers.

package conditionalsandloops.fib;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        int n1=0;
        int n2=1;
        int sum=0;
        System.out.print(n1 +" "+n2);
        for (int i = 2; i <n; i++) {
            sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }

        input.close();
    }
}
