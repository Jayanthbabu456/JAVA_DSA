    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
package patterns.pattern5;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int row = 0; row <2*n; row++) {
            int totalcols=row>n ?2*n-row : row;
            for (int col = 0; col < totalcols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        in.close();

    }
}
