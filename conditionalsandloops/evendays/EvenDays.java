// Jayanth is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
package conditionalsandloops.evendays;

import java.util.Scanner;

public class EvenDays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int month_count=input.nextInt();
        int evenday=0;
        for (int i = 1; i <=month_count; i++) {
            if(i%2==0){
                evenday++;
            }
        }
        System.out.println(evenday);
        input.close();
    }
}
