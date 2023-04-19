package com.comp301.lec20.inclass.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlaylistImpl implements Playlist {
    List<Song> playlist;
    List<PlaylistObserver> observers;

    public PlaylistImpl() {
        playlist = new ArrayList<Song>();
        observers = new ArrayList<PlaylistObserver>();
    }

    @Override
    public int getNumSongs() {
        return playlist.size();
    }

    @Override
    public Song getSong(int index) {
        return playlist.get(index);
    }

    @Override
    public void addSong(Song song) {
        playlist.add(song);
        notifyObservers();
    }

    @Override
    public void removeSong(int index) {
        playlist.remove(index);
        notifyObservers();
    }

    @Override
    public void moveSong(int oldIndex, int newIndex) {
        Song s = playlist.get(oldIndex);
        playlist.remove(s);
        playlist.add(newIndex, s);
        notifyObservers();
    }

    @Override
    public void addObserver(PlaylistObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(PlaylistObserver observer) {
        observers.remove(observer);
    }

    public void shuffle() {
        Collections.shuffle(playlist);
        notifyObservers();
    }

    private void notifyObservers() {
        for (PlaylistObserver o : observers) {
            o.update(this);
        }
    }
}
