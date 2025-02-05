package com.tracker.model;

import com.tracker.enums.Genre;

import java.time.LocalDate;

public class Book {

    private Integer book_id;
    private String title;
    private String author;
    private Genre genre;
    private LocalDate publish_date;
    private String cover_img_url;

    public Book() {
    }

    public Book(Integer book_id, String title, String author, Genre genre, LocalDate publish_date, String cover_img_url) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publish_date = publish_date;
        this.cover_img_url = cover_img_url;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public LocalDate getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(LocalDate publish_date) {
        this.publish_date = publish_date;
    }

    public String getCover_img_url() {
        return cover_img_url;
    }

    public void setCover_img_url(String cover_img_url) {
        this.cover_img_url = cover_img_url;
    }
}
