package com.comp301.lec20.inclass.controller;

import com.comp301.lec20.inclass.model.Playlist;
import com.comp301.lec20.inclass.model.Song;
import com.comp301.lec20.inclass.model.SongImpl;

public class ControllerImpl implements Controller {

    private Playlist playlist;

    public ControllerImpl(Playlist playlist) {
        this.playlist = playlist;
    }

    @Override
    public int getNumSongs() {
        return playlist.getNumSongs();
    }

    @Override
    public Song getSong(int index) {
        return playlist.getSong(index);
    }

    @Override
    public void addSong(String title, String artist, int rating) {
        Song s = new SongImpl(title, artist, rating);
        playlist.addSong(s);
    }
}
