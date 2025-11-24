package multithreding;

public class Deadlock {

    public static void main(String[] args) {

        final String bluePen="Blue Pen";
        final String blackPen="Black Pen";

        Thread personA=new Thread( ()-> {
            synchronized (bluePen) {
                System.out.println("person A got blue pen");

                try{
                    Thread.sleep(100);
                }
                catch (Exception e){ }
                synchronized (blackPen){
                    // avoid: Tell both people to always pick blue pen first, then black pen:e

                    System.out.println("person A got blue pen");
                }
            }
        });

        Thread personB = new Thread(() -> {
            synchronized (blackPen) {
                System.out.println("Person B got Black Pen");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (bluePen) {
                    System.out.println("Person B got Blue Pen");
                }
            }
        });
        personA.start();
        personB.start();
    }
}
