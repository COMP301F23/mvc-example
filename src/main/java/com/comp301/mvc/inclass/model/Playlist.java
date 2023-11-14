package com.comp301.mvc.inclass.model;

public interface Playlist {

    int getNumSongs();
    Song getSong(int index);
    void removeSong(int index);
    void addSong(Song song, int index);
    void addPlaylistObserver(PlaylistObserver observer);
    void removePlaylistObserver(PlaylistObserver observer);
}
