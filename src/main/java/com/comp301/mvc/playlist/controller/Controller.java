package com.comp301.mvc.playlist.controller;

import com.comp301.mvc.playlist.model.Song;

public interface Controller {
  Song getSong(int index);

  int getNumSongs();

  void moveSongUp(int index);

  void moveSongDown(int index);

  void addSong(String title, String artist, int rating);

  void removeSong(int index);

  void shuffleSongs();
}
