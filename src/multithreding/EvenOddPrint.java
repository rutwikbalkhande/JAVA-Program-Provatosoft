package multithreding;

public class EvenOddPrint {

    int number = 1;
    final int MAX = 100;

    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 != 0) {
                try {
                    wait();  // wait for odd thread to print

                    //  Thread.sleep(500)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Even: " + number + " -> " + Thread.currentThread().getName());
                number++;
                notify();  // notify odd thread
            }
        }
    }

    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                try {
                    wait();  // wait for even thread to print
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Odd: " + number + " -> " + Thread.currentThread().getName());
                number++;
                notify();  // notify even thread
            }
        }
    }

    public static void main(String[] args) {
        EvenOddPrint evenOdd = new EvenOddPrint();

        Thread t1 = new Thread(() -> evenOdd.printEven(), "EvenThread");
        Thread t2 = new Thread(() -> evenOdd.printOdd(), "OddThread");

        t1.start();
        t2.start();
    }
}
