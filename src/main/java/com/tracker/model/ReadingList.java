package com.tracker.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadingList {
    private Integer readingListId;
    private List<Reading> list = new ArrayList<>();
    private LocalDate added_date;

    public ReadingList() {
    }

    public ReadingList(Integer readingListId, LocalDate added_date) {
        this.readingListId = readingListId;
        this.added_date = added_date;
    }

    public Integer getReadingListId() {
        return readingListId;
    }

    public void setReadingListId(Integer readingListId) {
        this.readingListId = readingListId;
    }

    public List<Reading> getList() {
        return list;
    }

    public LocalDate getAdded_date() {
        return added_date;
    }

    public void setAdded_date(LocalDate added_date) {
        this.added_date = added_date;
    }

    public void addReading(Reading reading){
        list.add(reading);
    }

    public void removeReading(Reading reading){
        list.remove(reading);
    }

    public void getTotalReadings(){
        System.out.println("Número total de leituras: " + list.size());
        System.out.println("Livros: ");
        list.forEach(e -> {
            System.out.println(e.getBook().getTitle());
        });
    }
}
