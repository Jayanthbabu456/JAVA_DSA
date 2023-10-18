// Define a program to find out whether a given number is even or odd.
package functions.evenodd;

import java.util.Scanner;

/**
 * EvenOdd
 */
public class EvenOdd {
    static void evenodd(int num){
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        evenodd(n);
        input.close();
    }
}