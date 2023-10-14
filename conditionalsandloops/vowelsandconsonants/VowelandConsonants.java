package conditionalsandloops.vowelsandconsonants;

import java.util.Scanner;

public class VowelandConsonants {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch=input.next().charAt(0);
        ch = Character.toLowerCase(ch);

        switch (ch) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
                case 'o':
                System.out.println("Vowel");
                break;
                case 'u':
                System.out.println("Vowel");
                break;
        
            default:
                if (ch>='a'&&ch<='z') {
                    System.out.println("Consonant");
                } else {
                    
                    System.out.println("Not valid char");
                }
                break;
        }
        input.close();
    }
}
