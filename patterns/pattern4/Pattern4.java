// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
package patterns.pattern4;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int  num=in.nextInt();
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
