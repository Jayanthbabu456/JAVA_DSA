// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

package conditionalsandloops.sumofpositiveandnegative;

import java.util.Scanner;

public class SumPositiveandNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int negativesum = 0;
        int positiveoddsum = 0;
        int positiveevensum = 0;
        
        while (true) {
            System.out.print("Enter a number (or 0 to quit): ");
            num = input.nextInt();

            if (num == 0) {
                break; 
            }

            if (num < 0) {
                negativesum += num;
            } else if (num % 2 == 0) {
                positiveevensum += num;
            } else {
                positiveoddsum += num;
            }
        }

        System.out.println(negativesum);
        System.out.println(positiveoddsum);
        System.out.println(positiveevensum);
        
        input.close();
    }
}
