package com.comp301.lec20.inclass.controller;

import com.comp301.lec20.inclass.model.Song;

public interface Controller {
    int getNumSongs();
    Song getSong(int index);
    void addSong(String title, String artist, int rating);
}
