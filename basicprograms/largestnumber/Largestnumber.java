package basicprograms.largestnumber;
import java.util.Scanner;
public class Largestnumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=input.nextInt();
        System.out.println("Enter b value");
        int b=input.nextInt();
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
input.close();
    }
}
