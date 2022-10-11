public class Task4{
    public static void main(String[] args){

        int n=3;
        char c = '*';

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)

            {
                System.out.print(" ");
            }

            for(int j=1;j<=i*2-1;j++)

            {
                System.out.print(c);
            }
            System.out.println();

        }
        for(int i=n-1;i>0;i--)
        {
            for(int j=1;j<=n-i;j++)

            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)

            {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
