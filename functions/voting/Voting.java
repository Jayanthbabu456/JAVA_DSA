// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.


package functions.voting;

import java.util.Scanner;

public class Voting {
    static void checkage(int num){
        if(num>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        checkage(n);
        input.close();
    }
}
