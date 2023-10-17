package functions.maxmin;

import java.util.Scanner;

public class MaxMin {
    static void largest(int first,int second,int third){
        if (first>=second && first>=third) {
            System.out.println(first);
        } else if(second>=first && second>=third){
            System.out.println(second);
        }
        else{
            System.out.println(third);
        }
    }
    static void smallest(int first,int second,int third){
        if (first<=second && first<=third) {
            System.out.println(first);
        } else if(second<=first && second<=third){
            System.out.println(second);
        }
        else{
            System.out.println(third);
        }
    }
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            largest(a, b, c);
            smallest(a,b, c);
            input.close();
            
        }
}
