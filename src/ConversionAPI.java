import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Scanner;

public class ConversionAPI {

    // Parte base del enlace de la API
    private static final String BASE_API_URL = "https://v6.exchangerate-api.com/v6/6276d3a5bc553b2396bcd6d9/pair/";

    // Nuevo método que retorna el valor convertido
    public double convertirMoneda(String from, String to, double cantidad) {
        try {
            // Crear la URL dinámica
            String apiUrl = BASE_API_URL + from + "/" + to;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Parsear la respuesta JSON
            JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();

            // Verificar si la solicitud fue exitosa
            String result = jsonResponse.get("result").getAsString();
            if (!"success".equals(result)) {
                System.out.println("Error en la conversión: " + jsonResponse.get("error-type").getAsString());
                return -1;
            }

            // Obtener la tasa de cambio
            double tasaDeCambio = jsonResponse.get("conversion_rate").getAsDouble();

            // Realizar la conversión
            return cantidad * tasaDeCambio;

        } catch (Exception e) {
            System.out.println("Error al obtener los datos de la API: " + e.getMessage());
            return -1;
        }
    }
}
