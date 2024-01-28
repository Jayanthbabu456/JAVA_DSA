    //    E D C B A
    //    D C B A
    //    C B A
    //    B A
    //    A

package patterns.pattern31;

import java.util.Scanner;

public class Pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print((char) ('A' - 1 + j));
                if (j > 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
