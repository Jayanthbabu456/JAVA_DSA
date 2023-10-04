package conditionalsandloops.sumandproduct;

import java.util.Scanner;

public class SumProduct {
    public int subtractProductAndSum(int n) {
        
        int prod=1;
        int sum=0;
        while (n!=0) {
            int rem=n%10;
            sum=sum+rem;
            prod=prod*rem;
            n=n/10;
        }
        
       return prod-sum;
       
    }
    public static void main(String[] args){
         Scanner input=new Scanner(System.in);
        int num=input.nextInt();
 SumProduct solution = new SumProduct(); 
        int result = solution.subtractProductAndSum(num); 
        
        System.out.println(result);
        input.close();
    }
}

