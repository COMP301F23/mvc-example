package com.comp301.mvc.inclass.view;

import com.comp301.mvc.inclass.controller.Controller;
import com.comp301.mvc.inclass.model.Playlist;
import com.comp301.mvc.inclass.model.Song;
import com.comp301.mvc.inclass.view.SongView;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class PlaylistPanel implements FXComponent {

    private List<SongView> songviews;

    public PlaylistPanel(Playlist playlist, Controller controller) {
        songviews = new ArrayList<SongView>();

        for (int i=0; i<playlist.getNumSongs(); i++) {
            Song song = playlist.getSong(i);
            SongView song_view = new SongView(song, i, controller);
            songviews.add(song_view);
        }
    }

    public Parent render() {
        Pane vbox = new VBox();
        for (SongView sv : songviews) {
            vbox.getChildren().add(sv.render());
        }
        return vbox;
    }
}
