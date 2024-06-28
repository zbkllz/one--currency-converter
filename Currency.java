import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Currency {
    private String apiKey = "3fc78abf26b0bd261c99e6b5";

    public String exchangeCurrency(String CoinFrom, String CoinTo, double Amount) {
        URI url = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + CoinFrom + "/" + CoinTo + "/" + Amount);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(url)
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            CurrencyAPI conversionResult = gson.fromJson(response.body(), CurrencyAPI.class);
            return "Valor " + Amount + " [" + CoinFrom + "] corresponde ao valor final de =>> " + conversionResult.conversion_result() + "[" + CoinTo + "]";
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível converter esse valor");
        }
    }
}
