package application;

import java.util.Scanner;

public class UI {
    public static void showOption() {
        System.out.println("********************************************************");
        System.out.println("                  Currency Conversion                   ");
        System.out.println();
        System.out.println("                ARS - Argentinian peso                  ");
        System.out.println("                BOB - Bolivian bolivian                 ");
        System.out.println("                BRL - Brazilian real                    ");
        System.out.println("                CLP - Chilean peso                      ");
        System.out.println("                COP - Colombian peso                    ");
        System.out.println("                USD - American dollar                   ");
        System.out.println();
        System.out.println("********************************************************");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
