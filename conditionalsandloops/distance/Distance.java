// Calculate Distance Between Two Points

package conditionalsandloops.distance;

import java.util.Scanner;
import java.lang.Math;

public class Distance {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        Scanner input=new Scanner(System.in);
        x1=input.nextInt();
        x2=input.nextInt();
        y1=input.nextInt();
        y2=input.nextInt();
        int ans=(int)(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        int distance=(int)(Math.sqrt(ans));
        System.out.println(distance);
        input.close();
    }
}
