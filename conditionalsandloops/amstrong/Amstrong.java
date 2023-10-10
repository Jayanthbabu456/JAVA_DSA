// Armstrong Number In Java
package conditionalsandloops.amstrong;

import java.util.Scanner;

public class Amstrong {
    static int AmstrongNum(int n) {
        int digit = 0;
        int sum = 0;
        int temp = n;

        while (temp != 0) {
            temp /= 10;
            digit++;
        }

        // temp = n;

        while (temp != 0) {
            int rem = temp % 10;
            sum += (int) Math.pow(rem, digit);
            temp /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int ans = AmstrongNum(num);
       if (ans==num) {
        System.out.println("Amstrong");
       }
       else{
        System.out.println("NAmstrong");
       }
        input.close();
    }
}
