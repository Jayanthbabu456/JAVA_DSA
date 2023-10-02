// Area Of Circle Java Program
package basicprograms.areaofcircle;

import java.util.Scanner;

public class Areaofcircle {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter radius:");
        float radius;
        radius=input.nextFloat();
        double area=(22/7)*radius*radius;
        System.out.println("Area of Circle:"+ area);
        input.close();
    }
}