import java.util.Scanner;
public class Task1{
    public static void main(String[] args) {
        int i=0;
        int n=0;
        int num=0;
        System.out.println("Input amount of even and odd numbers you need");
        Scanner SC =new Scanner(System.in);
        n=SC.nextInt();
        System.out.println("Even");
        num=0;
        while(n>i) {
            num=num+2;
            System.out.print(num + ",");
            i++;}
        System.out.println();
        System.out.println("Odd");
        num=-1;
        i=0;
        while(n>i) {
            num=num+2;
            System.out.print(num + ",");
            i++;	}
    }}