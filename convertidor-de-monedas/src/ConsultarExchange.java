import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarExchange {
    public ExchangeRate buscarTipoDeCambio(String moneda_base, String moneda_cambio){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/91377199581c0433a5e2d408/pair/"
                        +moneda_base+"/"+moneda_cambio);
        //URI direccion = URI.create("https://v6.exchangerate-api.com/v6/91377199581c0433a5e2d408/latest/"+moneda_cambio);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ExchangeRate.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontro el tipo de cambio");
        }
    }
}
