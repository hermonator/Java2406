package ChapterThree;

import java.util.Scanner;

/**
 * Created by Jesse Hermon on 9/08/2016.
 */
public class TestLease {
    public static void main(String[] args) {

        Lease first = new Lease();
        Lease second = new Lease();
        Lease third = new Lease();
        Lease fourth = new Lease();

        //first.setData();
        //second.setData();
        //third.setData();

        first.showValue();
        second.showValue();
        third.showValue();
        fourth.showValue();

        first.addPetFee();

        first.showValue();


    }

}
