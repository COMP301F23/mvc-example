package com.comp301.mvc.inclass.controller;

public interface Controller {

    void shuffle();
    void deleteSong(int song_index);
    void moveSongUp(int song_index);
    void moveSongDown(int song_index);
    void addSong(String title, String artist, int rating);

}
