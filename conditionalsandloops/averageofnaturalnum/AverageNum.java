package conditionalsandloops.averageofnaturalnum;

import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        float ans=(float)(num+1)/2;
        System.out.println(ans);
        input.close();
    }
}
