package ChapterFour;

/**
 * Created by jc259420 on 23/08/2016.
 */
public class Billing {
    public static void main(String[] args) {
        double price = 9.99;
        int quantitiy = 10;
        double couponValue = 25.99;
        System.out.println(computerBill(price));
        System.out.println(computerBill(price,quantitiy));
        System.out.println(computerBill(price,quantitiy,couponValue));
    }
    public static double computerBill(double price){
        double cost = price + (price * 0.080);
        return cost;
    }
    public static double computerBill(double price, int quantity){
        double cost = (price * quantity) + ((price * quantity) * 0.08);
        return cost;
    }
    public static double computerBill(double price, int quantity, double couponValue){
        double cost = (price * quantity - couponValue) + ((price * quantity - couponValue) * 0.08);
        return cost;
    }
}
