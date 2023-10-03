package basicprograms.areaofrectangle;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
      System.out.println("Enter length");
      int l=input.nextInt();
            System.out.println("Enter width");
            int w=input.nextInt();
            float area=l*w;
            System.out.println("Area of rectangle:"+ area);
            input.close();
    }
}
