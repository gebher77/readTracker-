package com.tracker.model;

import com.tracker.enums.Reading_Status;

import java.time.LocalDate;
public class Reading {

    private Integer reading_id;
    private Book book;
    private LocalDate start_date;
    private LocalDate end_date;
    private Reading_Status status;
    private Integer current_page;
    private String comment;

    public Reading() {
    }

    public Reading(Integer reading_id, Book book, LocalDate start_date, LocalDate end_date, Reading_Status status, Integer current_page, String comment) {
        this.reading_id = reading_id;
        this.book = book;
        this.start_date = start_date;
        this.end_date = end_date;
        this.status = status;
        this.current_page = current_page;
        this.comment = comment;
    }

    public Integer getReading_id() {
        return reading_id;
    }

    public void setReading_id(Integer reading_id) {
        this.reading_id = reading_id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    public Reading_Status getStatus() {
        return status;
    }

    public void setStatus(Reading_Status status) {
        this.status = status;
    }

    public Integer getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(Integer current_page) {
        this.current_page = current_page;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
