package com.comp301.mvc.inclass.controller;

import com.comp301.mvc.inclass.model.Playlist;

public class ControllerImpl implements Controller {

    private Playlist model;

    public ControllerImpl(Playlist model) {
        this.model = model;
    }

    @Override
    public void shuffle() {
        System.out.println("Need to shuffle");
    }

    @Override
    public void deleteSong(int song_index) {

    }

    @Override
    public void moveSongUp(int song_index) {

    }

    @Override
    public void moveSongDown(int song_index) {

    }

    @Override
    public void addSong(String title, String artist, int rating) {

    }
}
