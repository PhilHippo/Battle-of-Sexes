import java.util.Arrays;

// this class alternates day and night
// day: individuals copulate
// night: we collect data while individuals sleep

public class Time {

    public static volatile Boolean day = false;
    // true = day
    // false = night

    public static void dayTime(long millis) throws InterruptedException{
        day = true;
        //System.out.println("It is day");g
        Thread.sleep(millis);
    }

    public static void nightTime(int gen){
        day = false;
        System.out.println("iterazione "+gen+" "+Arrays.toString(Population.numberIndividuals));
        Population.updateGraph(gen);
    }
}
