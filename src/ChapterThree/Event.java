package ChapterThree;

import java.util.Scanner;

/**
 * Created by jc259420 on 22/08/2016.
 */
public class Event {

    public final static int PRICE_PER_PERSON = 35;
    public final static int LARGE_EVENT_CUTOFF = 50;

    private String eventNumber;
    private int numberOfGuests;
    private double costings;

    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
        this.costings = numberOfGuests * PRICE_PER_PERSON;
    }

    public int getNumberOfGuests() {
        
        return numberOfGuests;
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public double getCostings() {
        return costings;
    }
}
