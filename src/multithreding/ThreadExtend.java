package multithreding;

public class ThreadExtend extends  Thread {
    //Cteating thread using Thread class

    public void run()
    {
        for(int i=10;i>=1;i--)
        {
            System.out.println("Threa Extend class :"+ i);

            try{
                Thread.sleep(2000);
            }
            catch(Exception e)
            {

            }
        }
    }
    public static void main(String[] args) {

        ThreadExtend th= new ThreadExtend();

        Thread t1=new Thread();
        t1.start();

        //object of another thread

    }
}
