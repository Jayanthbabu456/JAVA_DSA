// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
package conditionalsandloops.sumuntilzero;

import java.util.Scanner;

public class Sumuntilzero {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=0;
        int num;
        do {
            num=in.nextInt();
            sum=sum+num;
        } while (num!=0);
        System.out.println(sum);
        in.close();
    }
}
