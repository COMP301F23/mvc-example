package com.comp301.mvc.inclass.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlaylistImpl implements Playlist {

    private List<Song> playlist;
    private List<PlaylistObserver> observers;

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
    public void removeSong(int index) {
        playlist.remove(index);

        notifyObservers();
    }

    @Override
    public void addSong(Song song, int index) {
        playlist.add(index, song);

        notifyObservers();
    }

    public void shuffle() {
        Collections.shuffle(playlist);
        notifyObservers();
    }

    @Override
    public void addPlaylistObserver(PlaylistObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removePlaylistObserver(PlaylistObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (PlaylistObserver o : observers) {
            o.update(this);
        }
    }
}
