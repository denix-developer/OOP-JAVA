import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        float a=0;
        int b=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter floating point number");
        a=scan.nextFloat();
        b=(int)a;
        a=a-b;
        System.out.println("Integral part "+b);
        System.out.println("Fractional part "+a);

    }

}