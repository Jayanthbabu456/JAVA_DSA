// Check Leap Year Or Not
package conditionalsandloops.leapyear;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int year=input.nextInt();
       if((year%400==0)||(year%4==0)&&(year%100!=0)){
        System.out.println("Leap Year");
       }
       else{
        System.out.println("Not Leap Year");
       }
       input.close();
    }
}