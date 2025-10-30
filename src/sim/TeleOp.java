package sim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Simple TeleOp simulator: enter commands in the terminal:
 * w = forward 1, s = back 1, a = turn -15°, d = turn +15°, p = print status, q = quit
 */
public class TeleOp {
    public static void main(String[] args) throws Exception {
        Robot r = new Robot();
        DriveTrain dt = new DriveTrain(r);
        System.out.println("TeleOp mode. Commands: w/s (forward/back), a/d (turn), p (status), q (quit)");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (true) {
            System.out.print("> ");
            line = br.readLine();
            if (line == null) break;
            line = line.trim().toLowerCase();
            if (line.equals("q")) break;
            switch (line) {
                case "w": dt.forward(1); break;
                case "s": dt.forward(-1); break;
                case "a": dt.rotate(-15); break;
                case "d": dt.rotate(15); break;
                case "p": r.printStatus(); break;
                default: System.out.println("Unknown command");
            }
        }
        System.out.println("TeleOp finished. Final status:");
        r.printStatus();
    }
}
