// Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

 
// Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail 

package functions.marksgrade;

import java.util.Scanner;

public class MarksGrade {
    static void Grade(int num){
        if(num>=91 && num<=100){
            System.out.println("AA");
        }
        else if(num>=81 && num<=90){
            System.out.println("AB");
        }
        else if(num>=71 && num<=80){
            System.out.println("BB");
        }
        else if(num>=61 && num<=70){
            System.out.println("BC");
        }
        else if(num>=51 && num<=60){
            System.out.println("CD");
        }
        else if(num>=41 && num<=50){
            System.out.println("DD");
        }
        else{
            System.out.println("FF");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int marks=input.nextInt();
        Grade(marks);
        input.close();
    }
}
