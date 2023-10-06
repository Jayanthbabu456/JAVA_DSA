// Input a number and print all the factors of that number (use loops).
import java.util.Scanner;

/**
 * Factors
 */
public class Factors {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i +" ");
            }
        }
        input.close();

    }
}