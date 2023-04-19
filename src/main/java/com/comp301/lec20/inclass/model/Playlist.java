package com.comp301.lec20.inclass.model;

public interface Playlist {

    int getNumSongs();
    Song getSong(int index);
    void addSong(Song song);
    void removeSong(int index);
    void moveSong(int oldIndex, int newIndex);
    void shuffle();

    void addObserver(PlaylistObserver observer);
    void removeObserver(PlaylistObserver observer);

}
