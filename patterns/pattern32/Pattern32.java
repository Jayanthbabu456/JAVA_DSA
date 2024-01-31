// E
// D E
// C D E
// B C D E
// A B C D E
package patterns.pattern32;

import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            
            for (char ch = (char) ('A' + n - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}
