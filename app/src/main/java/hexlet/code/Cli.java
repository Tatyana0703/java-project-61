package hexlet.code;

import java.util.Scanner;
import static java.lang.System.*;

public class Cli {

    public static void greet() {
        Scanner scanner = new Scanner(in);

        out.println("Hello, world!");
        out.print("What is your name? ");
        String userName = scanner.next();
        out.println("Hello, " + userName + "!");

        scanner.close();
    }
}
