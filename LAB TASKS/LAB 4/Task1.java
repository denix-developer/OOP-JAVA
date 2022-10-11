import java.util.Scanner;
public class Task1{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input;
        char a;
        System.out.println("enter a character");
        input=scan.next();
        a=input.charAt(0);
        switch (a){
            case 'a':
                System.out.println("Its a vowel");
                break;

            case 'e':
                System.out.println("Its a vowel");
                break;

            case 'i':
                System.out.println("Its a vowel");
                break;

            case 'o':
                System.out.println("Its a vowel");
                break;

            case 'u':
                System.out.println("Its a vowel");
                break;

            default:
                System.out.println("Its a consonent");
                break;

        }
    }
}