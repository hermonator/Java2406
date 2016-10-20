package Prac6;

/**
 * Created by jc259420 on 20/10/2016.
 */
public class DemoCandles {

    public static void main(String[] args) {
        System.out.println("Demonstrating the candles class....");
        Candle small = new Candle();
        small.setColour("blue");
        small.setHeight(20);

        System.out.println("The small candle is " + small.getColour() + " and is " + small.getHeight() + " inches high. It costs: $" + small.getPrice());

        System.out.println("Demonstrating the ScentedCandles class....");
        ScentedCandle large = new ScentedCandle();
        large.setHeight(50);
        large.setColour("red");
        large.setScent("rosemary");

        System.out.println("The large candle is " + large.getColour() + ", is " + large.getHeight() + " inches high and is " + large.getScent() + " scented. It costs: $" + large.getPrice());
    }


}
