// Define a method to find out if a number is prime or not.
package functions.prime;

import java.util.Scanner;

public class Prime {
    static void primeornot(int num) {
        if (num <= 1) {
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        primeornot(n);
        input.close();
    }
}
