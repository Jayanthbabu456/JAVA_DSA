// Write a program to input principal, time, 
//and rate (P, T, R) from the user and find Simple Interest.

package basicprograms.simpleintrest;

import java.util.Scanner;

public class Simpleintrest {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.println("Enter Principal");
          int p=input.nextInt();
                System.out.println("Enter Rate");
                  int r=input.nextInt();
        System.out.println("Enter Intrest");
         int i=input.nextInt();
        int ans=(p*r*i)/100;
        System.out.println("Simple Intrest:"+ans);
input.close();
    }
}
