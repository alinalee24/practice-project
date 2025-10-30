package sim;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Robot r = new Robot();
        DriveTrain dt = new DriveTrain(r);

        System.out.println("Simple simulator on main branch. This runs a demonstration sequence.");
        r.printStatus();

        dt.forward(10);   // move forward 10 units
        dt.rotate(90);    // turn left 90 degrees
        dt.forward(5);    // move forward 5 units
        dt.rotate(-45);   // turn right 45 degrees
        dt.forward(Math.sqrt(2) * 5); // move diagonally (example)
        System.out.println("Done demo.");
        r.printStatus();
    }
}
