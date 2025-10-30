package sim;

/**
 * Simple robot state and basic movement methods
 */
public class Robot {
    public double x = 0;
    public double y = 0;
    // heading in degrees, 0 = facing +x, positive = counterclockwise
    public double heading = 0;

    public void moveForward(double distance) {
        double rad = Math.toRadians(heading);
        x += distance * Math.cos(rad);
        y += distance * Math.sin(rad);
        System.out.printf("Moved %.2f -> position (%.2f, %.2f), heading %.2f°%n", distance, x, y, heading);
    }

    public void turn(double degrees) {
        heading += degrees;
        heading = normalizeAngle(heading);
        System.out.printf("Turned %.2f° -> heading %.2f°%n", degrees, heading);
    }

    private double normalizeAngle(double a) {
        a %= 360;
        if (a < 0) a += 360;
        return a;
    }

    public void printStatus() {
        System.out.printf("Robot at (%.2f, %.2f) heading %.2f°%n", x, y, heading);
    }
}
