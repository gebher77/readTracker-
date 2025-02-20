package com.tracker.model.enums;

import com.google.gson.annotations.SerializedName;

public enum Genre {
    @SerializedName("Fiction")
    FICTION("Ficção"),

    @SerializedName("Non Fiction")
    NON_FICTION("Não Ficção"),

    @SerializedName("Science Fiction")
    SCIENCE_FICTION("Ficção Científica"),

    @SerializedName("Fantasy")
    FANTASY("Fantasia"),

    @SerializedName("Mystery")
    MYSTERY("Mistério"),

    @SerializedName("Romance")
    ROMANCE("Romance"),

    @SerializedName("Self-Help")
    SELF_HELP("Autoajuda"),

    @SerializedName("Biography")
    BIOGRAPHY("Biografia"),

    @SerializedName("History")
    HISTORY("História"),

    @SerializedName("Thriller")
    THRILLER("Suspense"),

    @SerializedName("Horror")
    HORROR("Terror"),

    @SerializedName("Poetry")
    POETRY("Poesia"),

    @SerializedName("Drama")
    DRAMA("Drama"),

    @SerializedName("Adventure")
    ADVENTURE("Aventura"),

    @SerializedName("Philosophy")
    PHILOSOPHY("Filosofia"),

    @SerializedName("Science")
    SCIENCE("Ciência"),

    @SerializedName("Travel")
    TRAVEL("Viagem"),

    @SerializedName("Cooking")
    COOKING("Culinária"),

    @SerializedName("Art")
    ART("Arte"),

    @SerializedName("Music")
    MUSIC("Música");

    private final String displayName;

    Genre(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
