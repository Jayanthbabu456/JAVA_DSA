// Define a method to find out the sum.
package functions.sum;

import java.util.Scanner;

public class Sum {
    static void Calculatesum(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        Calculatesum(num1, num2);
        input.close();
    }
}
