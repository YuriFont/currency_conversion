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

        if (!exchangeInfo.result().equalsIgnoreCase("success"))
            return;

        String response = String.format("%.2f - %s converted to %s is", value, originalCurrency.toUpperCase(), destinationCurrency.toUpperCase());
        double rate = 0.0;
        switch (destinationCurrency.toUpperCase()) {
            case "ARS":
                rate = exchangeInfo.conversion_rates().ARS();
                break;
            case "BOB":
                rate = exchangeInfo.conversion_rates().BOB();
                break;
            case "BRL":
                rate = exchangeInfo.conversion_rates().BRL();
                break;
            case "CLP":
                rate = exchangeInfo.conversion_rates().CLP();
                break;
            case "COP":
                rate = exchangeInfo.conversion_rates().COP();
                break;
            case "USD":
                rate = exchangeInfo.conversion_rates().USD();
                break;
            default:
                System.out.println("\nCurrency not supported\n");
                return;
        }

        System.out.printf("\n%s %.2f%n\n", response, rate * value);
    }
}
