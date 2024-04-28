package application;

import models.Converter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalCurrency;
        String destinationCurrency;
        String c = "";
        double value;

        do {
            UI.clearScreen();
            UI.showOption();
            System.out.print("\nEnter the source currency you want to convert (Ex: ARS): ");
            originalCurrency = sc.nextLine();
            System.out.print("Enter which currency you want to convert to (Ex: BRL): ");
            destinationCurrency = sc.nextLine();
            if (!UI.checkParameter(originalCurrency) || !UI.checkParameter(destinationCurrency)) {
                System.out.println("\nOne of the coins was not detected, please try again\n");
                continue;
            }
            System.out.print("Now enter the value you want to convert: ");
            value = sc.nextDouble();
            try {
                Converter.converterExchange(originalCurrency, destinationCurrency, value);
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException("Error: " + e.getMessage());
            }
            sc.nextLine();
            System.out.println("Press enter to do another conversion or type \"exit\" to exit...");
            c = sc.nextLine();
        } while (!c.equalsIgnoreCase("exit"));
        sc.close();
    }
}
