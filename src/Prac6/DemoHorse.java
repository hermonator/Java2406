package Prac6;

/**
 * Created by jc259420 on 20/10/2016.
 */
public class DemoHorse {

    public static void main(String[] args) {
        System.out.println("Demonstrating the horse class...");
        Horse Pharlap = new Horse();
        Pharlap.setBirthYear("1966");
        Pharlap.setName("Pharlap");
        Pharlap.setColour("black");

        System.out.println("The horse " + Pharlap.getName() + " was born " + Pharlap.getBirthYear() + ", it is the " + Pharlap.getColour());

        System.out.println("\nDemonstrating the race horse class...");
        RaceHorse Betty = new RaceHorse();
        Betty.setColour("white");
        Betty.setName("Betty");
        Betty.setBirthYear("1996");
        Betty.setNumOfRace(50);
        System.out.println("The horse " + Betty.getName() + " was born " + Betty.getBirthYear() + ", it is the " + Betty.getColour() + ". She has completed " + Betty.getNumOfRace() + " races.");
    }

}
