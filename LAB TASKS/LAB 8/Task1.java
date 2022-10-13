class thread extends Thread{
    int i;

    @Override
    public void run() {

        try {//for sleep we use try catch blocks

            for(int i=0;i<51;i++) {//go till 50
                System.out.println(i);//print i
                if(i==30) {
                    this.sleep(5000);//sleep for 5 seconds at i = 30
                }
            }

        } catch (Exception e) {
            System.out.println(e);//catch block
        }

    }}                                                //class close

public class Task1{
    public static void main(String[] args) {
        thread thread1 = new thread();
        thread1.start();

    }
}