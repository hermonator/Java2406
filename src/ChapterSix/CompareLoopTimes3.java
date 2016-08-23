package ChapterSix;

import java.time.LocalDateTime;

/**
 * Created by jc259420 on 23/08/2016.
 */
public class CompareLoopTimes3 {
    public static void main(String[] args) {
        int startTime, endTime;
        final int REPEAT = 100_000;
        final int FACTOR = 1_000_000;
        LocalDateTime now;
        now = LocalDateTime.now();
        startTime = now.getNano();
        for(int x = 0; x <= REPEAT; ++x)
            for(int y = 0; y <= REPEAT; ++y);
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops starting from 0: " + ((1000 + endTime - startTime) / FACTOR) + "milliseconds");
        now = LocalDateTime.now();
        startTime = now.getNano();
        for(int x = REPEAT; x >= 0; --x)
            for(int y = REPEAT; y >= 0; --y);
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops ending with 0: " + ((1000 + endTime - startTime) / FACTOR) + " milliseconds");

    }
}
