package models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultAPI {
    public static String exchangeRateAPI(String exchange) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/1da92f2bf2e23e75e26a2f44/latest/" + exchange;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
