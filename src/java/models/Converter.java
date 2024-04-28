package models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

public class Converter {
    public static void converterExchange(String originalCurrency, String destinationCurrency, double value) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        ExchangeInfo exchangeInfo = gson.fromJson(ConsultAPI.exchangeRateAPI(originalCurrency), ExchangeInfo.class);
        String response = String.format("%.2f - %s converted to %s is", value, originalCurrency, destinationCurrency);
        if (!exchangeInfo.result().equalsIgnoreCase("success"))
            return;
        if (destinationCurrency.equalsIgnoreCase("ARS")) {
            System.out.printf("\n%s %.2f%n\n", response, exchangeInfo.conversion_rates().ARS() * value);
        } else if (destinationCurrency.equalsIgnoreCase("BOB")) {
            System.out.printf("\n%s %.2f%n\n", response, exchangeInfo.conversion_rates().BOB() * value);
        } else if (destinationCurrency.equalsIgnoreCase("BRL")) {
            System.out.printf("\n%s %.2f%n\n", response, exchangeInfo.conversion_rates().BRL() * value);
        } else if (destinationCurrency.equalsIgnoreCase("CLP")) {
            System.out.printf("\n%s %.2f%n\n", response, exchangeInfo.conversion_rates().CLP() * value);
        } else if (destinationCurrency.equalsIgnoreCase("COP")) {
            System.out.printf("\n%s %.2f%n\n", response, exchangeInfo.conversion_rates().COP() * value);
        } else if (destinationCurrency.equalsIgnoreCase("USD")) {
            System.out.printf("\n%s %.2f%n\n", response, exchangeInfo.conversion_rates().USD() * value);
        }
    }
}
