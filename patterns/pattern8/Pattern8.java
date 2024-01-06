    //     *
    //    ***
    //   *****
    //  *******
    // *********
package patterns.pattern8;

import java.util.Scanner;

public class Pattern8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int spaces = n - 1; 

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }

            System.out.println();
            spaces--; 
        }
    }
}
