package sim;

/**
 * DriveTrain is a thin wrapper around the Robot to simulate drivetrain commands.
 */
public class DriveTrain {
    private Robot robot;

    public DriveTrain(Robot r) {
        this.robot = r;
    }

    public void forward(double d) {
        robot.moveForward(d);
    }

    public void rotate(double deg) {
        robot.turn(deg);
    }
}
