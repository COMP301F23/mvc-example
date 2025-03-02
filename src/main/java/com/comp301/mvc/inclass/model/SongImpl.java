package com.comp301.mvc.inclass.model;

public class SongImpl implements Song {
    private String title;
    private String artist;
    private int rating;

    public SongImpl(String title, String artist, int rating) {
        // Defensive programming here.

        this.title = title;
        this.artist = artist;
        this.rating = rating;
    }


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getArtist() {
        return artist;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
