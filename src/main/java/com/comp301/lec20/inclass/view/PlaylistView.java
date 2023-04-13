package com.comp301.lec20.inclass.view;

import com.comp301.lec20.inclass.controller.Controller;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;

public class PlaylistView {
    private Controller controller;

    public PlaylistView(Controller controller) {
        this.controller = controller;
    }

    public Parent render() {
        VBox layout = new VBox();

        int num_songs = controller.getNumSongs();

        for (int i=0; i<num_songs; i++) {
            SongView sv = new SongView(controller, i);
            layout.getChildren().add(sv.render());
        }

        return layout;
    }
}
