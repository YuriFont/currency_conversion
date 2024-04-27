package application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.ConsultAPI;
import models.ExchangeInfo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder().setLenient().setPrettyPrinting().create();
        ConsultAPI.exchangeRateAPI("USD"), ExchangeInfo.class;

        System.out.print(exchangeInfo.baseCode());

        System.out.println();
    }
}
