package week1;

public class StopWatch { 

    private final long start;

    /**
     * Initialize a stopwatch object.
     */
    public StopWatch() {
        start = System.currentTimeMillis();
    } 


    /**
     * Returns the elapsed time (in seconds) since this object was created.
     */
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

} 

