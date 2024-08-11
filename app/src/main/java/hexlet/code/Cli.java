package hexlet.code;

import java.util.Scanner;
import static java.lang.System.in;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class Cli {

    static Logger logger = Logger.getLogger(Cli.class.getName());

    private Cli() {
    }

    public static void greet() {
        Scanner scanner = new Scanner(in);

        logger.info("Hello, world!");
        logger.info("What is your name? ");
        String userName = scanner.next();
        logger.log(Level.INFO, "Hello, {}!", userName);

        scanner.close();
    }
}
