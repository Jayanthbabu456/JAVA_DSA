// Calculate Discount Of Product
package conditionalsandloops.discount;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Marked Price");
        int mprice=input.nextInt();
        System.out.println("Enter Selling Price");
        int sprice=input.nextInt();
        int discount=mprice-sprice;
        float discount_p=((float)discount/mprice)*100;
        System.out.println(discount_p);
        input.close();
    }
}

