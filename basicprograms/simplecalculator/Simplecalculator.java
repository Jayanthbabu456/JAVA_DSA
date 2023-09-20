// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package basicprograms.simplecalculator;
import java.util.Scanner;
public class Simplecalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=input.nextInt();
                System.out.println("Enter b value");
                 int b=input.nextInt();
                        System.out.println("Enter op value");
                        String op=input.next();
                        if(op=="+"){
                           int ans=a+b;
                            System.out.println(ans);
                        }
                        else if(op=="-"){
                                 int ans=a-b;
                            System.out.println(ans);
                        }
                        else if(op=="*"){
                                 int ans=a*b;
                            System.out.println(ans);
                        }
                        else if(op=="/"){
                            int ans=a/b;
                            System.out.println(ans);
                        }
                        else {
                            System.out.println("Choose the correct option");
                        }
                        input.close();
    }
}
