// Take name as input and print a greeting message for that particular name.
package basicprograms.greeting;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Enter a name:");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        System.out.println("Hello"+" "+name);
        input.close();
    }
}
