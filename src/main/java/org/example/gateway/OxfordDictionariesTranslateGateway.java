package org.example.gateway;

import com.google.gson.Gson;
import org.example.entities.Response;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OxfordDictionariesTranslateGateway {
    private static final String BASE_URL = "https://od-api-sandbox.oxforddictionaries.com/api/v2/{endpoint}/{source_lang_translate}/{target_lang_translate}/{word_id}";
    private static final String APPLICATION_KEY = ""; //TODO generate and insert your Oxford API KEY here, https://developer.oxforddictionaries.com
    private static final String APPLICATION_ID = ""; //TODO generate and insert your Oxford API ID here, https://developer.oxforddictionaries.com

    public Response getTranslateText (String textToTranslate) {
        //String textToTranslate = "age";
        Gson gson = new Gson();
        String url = BASE_URL
                .replace("{endpoint}", "translations")
                .replace("{source_lang_translate}", "en")
                .replace("{target_lang_translate}", "ru")
                .replace("{word_id}", textToTranslate);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app_id", APPLICATION_ID)
                .header("app_key", APPLICATION_KEY)
                .GET()
                .build();

        String strResponse = null;
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Статус код: " + response.statusCode());
            System.out.println("Ответ API: " + response.body());
            strResponse = response.body();
        } catch (IOException | InterruptedException e) {
            System.err.println("Ошибка при вызове API: " + e.getMessage());
            e.printStackTrace();
        }
        return gson.fromJson(strResponse, Response.class);
    }
}
