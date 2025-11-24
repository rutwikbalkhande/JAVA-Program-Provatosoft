package multithreding;

public class APractice {

    int num=1;
    int max=10;

    public synchronized void printEven(){

        while(num<= max){

            if(num % 2 !=0){

                try{
                    wait();
                    Thread.sleep(5000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            else{
                System.out.println("even:" + num);
                num++;
                notify();
            }
        }
    }
    public synchronized  void printOdd(){

        while(num <= max){

            if(num %2 ==0){
                try{
                    wait();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            else{
                System.out.println("odd:" + num);
                num++;
                notify();
            }
        }
    }

    public static void main(String[] args) {

        APractice a= new APractice();

        Thread t= new Thread(()-> a.printEven() );
        Thread t1= new Thread(()-> a.printOdd());

        t.start();
        t1.start();
    }
}
