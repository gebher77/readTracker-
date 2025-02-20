package com.tracker.model.entities;

import com.google.gson.annotations.SerializedName;
import com.tracker.model.enums.Genre;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;


public class Book {

    @SerializedName("title")
    private String title;

    @SerializedName("authors")
    private List<String> authors;

    @SerializedName("categories")
    private List<Genre> genres;

    @SerializedName("imageLinks.thumbnail")
    private String cover_img_url;

    @SerializedName("publishedDate")
    private String publishDate;

    @SerializedName("description")
    private String description;


    public Book() {
    }

    public Book(String title, List<String> authors, List<Genre> genres, String cover_img_url, String publishDate, String description) {
        this.title = title;
        this.authors = authors;
        this.genres = genres;
        this.cover_img_url = cover_img_url;
        this.publishDate = publishDate;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public String getCover_img_url() {
        return cover_img_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setCover_img_url(String cover_img_url) {
        this.cover_img_url = cover_img_url;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Título: " + title + "\n");
        stringBuilder.append("Autores: ");
        authors.forEach(e -> {
            if (authors.indexOf(e) != authors.size() - 1) {
                stringBuilder.append(e).append(", ");
            } else {
                stringBuilder.append(e);
            }
        });
        stringBuilder.append("\n");
        stringBuilder.append("Genêros: ");
        genres.forEach(e -> {
            if (genres.indexOf(e) != genres.size() - 1) {
                stringBuilder.append(e).append(", ");
            } else {
                stringBuilder.append(e);
            }
        });
        stringBuilder.append("\n");
        stringBuilder.append("Data de publicação: " + getParsedPublishDate());
        stringBuilder.append("\n");
        stringBuilder.append("Descrição: " + description);
        return stringBuilder.toString();
    }

    private String getParsedPublishDate() {
        try {
            LocalDate data = LocalDate.parse(publishDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (DateTimeParseException e) {
            return "Data de publicação inválida";
        }
    }
}