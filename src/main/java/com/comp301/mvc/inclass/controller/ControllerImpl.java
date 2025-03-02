package com.comp301.mvc.inclass.controller;

import com.comp301.mvc.inclass.model.Playlist;
import com.comp301.mvc.inclass.model.Song;
import com.comp301.mvc.inclass.model.SongImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ControllerImpl implements Controller {

    private Playlist model;

    public ControllerImpl(Playlist model) {
        this.model = model;
    }

    @Override
    public void shuffle() {
        model.shuffle();
    }

    @Override
    public void deleteSong(int song_index) {
        model.removeSong(song_index);
    }

    @Override
    public void moveSongUp(int song_index) {
        System.out.println("moveSongUp " + song_index);
        if (song_index == 0) {
            return;
        }

        Song song = model.getSong(song_index);
        model.removeSong(song_index);
        model.addSong(song, song_index-1);
    }

    @Override
    public void moveSongDown(int song_index) {
        if (song_index == model.getNumSongs()-1) {
            return;
        }

        Song song = model.getSong(song_index);
        model.removeSong(song_index);
        model.addSong(song, song_index+1);

    }

    @Override
    public void addSong(String title, String artist, int rating) {
        title = title.trim();
        artist = artist.trim();

        if (title.equals("") || artist.equals("")) {
            return;
        }

        Song song = new SongImpl(title, artist, rating);
        model.addSong(song, model.getNumSongs());
    }
}
