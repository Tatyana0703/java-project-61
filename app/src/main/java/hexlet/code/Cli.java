package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, world!");
        System.out.println("What is your name? ");
        String userName = scanner.next();
        System.out.printf("Hello, %s!", userName);
        scanner.close();
    }
}
