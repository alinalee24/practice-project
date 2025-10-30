package sim;

/**
 * Simple autonomous example: a sequence of moves executed automatically.
 */
public class Auto {
    public static void main(String[] args) throws InterruptedException {
        Robot r = new Robot();
        DriveTrain dt = new DriveTrain(r);

        System.out.println("Auto mode: executing pre-planned path...");
        r.printStatus();

        // Example autonomous sequence
        dt.forward(20);
        Thread.sleep(300); // sleep to simulate time passing (just for console readability)
        dt.rotate(90);
        Thread.sleep(300);
        dt.forward(10);
        Thread.sleep(300);
        dt.rotate(-45);
        Thread.sleep(300);
        dt.forward(7.07); // ~diagonal
        System.out.println("Auto sequence complete.");
        r.printStatus();
    }
}
