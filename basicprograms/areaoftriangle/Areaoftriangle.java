// Area Of Triangle Java Program
package basicprograms.areaoftriangle;
import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter height");
      int h=input.nextInt();
            System.out.println("Enter base");
            int b=input.nextInt();
            double area=0.5*(b*h);
            System.out.println("Area of triangle:"+ area);
            input.close();
    }
}
