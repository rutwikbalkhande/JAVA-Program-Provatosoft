package multithreding;

public class RunnableThread implements Runnable {
// impliment Runnable Interface use two thread and sleep method
    public void run()
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println("value of RunnableThread :" + i);

            try {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            } } }

    public static void main(String[] args) {
// creating object of RunnableThread class

        RunnableThread t1=new RunnableThread();

        Thread thr=new Thread(t1);
        thr.start(); // Start first thread

       /*
            Thread t2=new Thread(new RunnableThread());      //onother way
             t2.start();                  // Start second thread by creating another RunnableThread class object
*/
        //object of another thread "ThreadExtend" class & run

        ThreadExtend t2=new ThreadExtend();
        t2.start();
    }
}
