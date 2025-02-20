package com.tracker.model.services;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.tracker.model.entities.Book;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GoogleBooksApi {

    private Gson gson = new Gson();

    public JsonObject obterDados(String book){



        String url = "https://www.googleapis.com/books/v1/volumes?q=" + book + "&maxResults=1";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);
        JsonObject item = jsonObject.getAsJsonArray("items").get(0).getAsJsonObject();

        return item.getAsJsonObject("volumeInfo");
    }

    public Book getBookDetails(String bookName) {
        JsonObject volumeInfo = obterDados(bookName);
        Book book = gson.fromJson(volumeInfo, Book.class);
        if (volumeInfo.has("imageLinks")) {
            JsonObject imgs = volumeInfo.getAsJsonObject("imageLinks");
            String img = imgs.get("thumbnail").getAsString();
            book.setCover_img_url(img);
        }
        return book;
    }

}
