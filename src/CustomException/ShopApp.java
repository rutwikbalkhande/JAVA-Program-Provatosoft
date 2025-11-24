package CustomException;

public class ShopApp {

    public static void main(String[] args) {

        int availableitem=10;
        int order=15;
try {
    if (availableitem > order) {

        int total = availableitem - order;

        System.out.println("order successful= " + order);
        System.out.println("remaining stock=" + total);
    } else {
        throw new OutOfStockException(order + " you cant order item:" + " Available item only: " + availableitem);
    }
}
 catch (OutOfStockException e){

        e.printStackTrace();

    }
    }

}
