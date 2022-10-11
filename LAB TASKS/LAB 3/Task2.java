public class Task2{
    public static void main(String[] args) {
        int count=0;
        for(char i=0;i<256;i++,count++) {
            System.out.print(i + " ");
            if(count>20) {
                System.out.println();
                count=0;
            }
        }
    }
}
