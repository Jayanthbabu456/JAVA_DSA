// Calculate Electricity Bill

package conditionalsandloops.electricitybill;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int units=input.nextInt();
        int ans;
        if(units<=100){
            ans=units*10;
        }
        else if(units>=100 && units<=200){
            ans=(100*10)+(units-100)*15;
        }
        else if(units>=100 && units<=300){
            ans=(100*10)+(100*15)+(units-200)*20;
        }
        else{
            ans=(100*10)+(100*15)+(100*20)+(units-300)*25;
        }
        System.out.println(ans);
        input.close();
    }
}
