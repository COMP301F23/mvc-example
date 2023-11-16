package com.comp301.mvc.inclass.view;

import com.comp301.mvc.inclass.controller.Controller;
import com.comp301.mvc.inclass.model.Playlist;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;

public class View implements FXComponent {
    private ControlPanel control_panel;
    private PlaylistPanel playlist_panel;
    private AddSongPanel add_song_panel;

    public View(Playlist playlist, Controller controller) {
        control_panel = new ControlPanel(controller);
        playlist_panel = new PlaylistPanel(playlist, controller);
        add_song_panel = new AddSongPanel();
    }

    @Override
    public Parent render() {

        Pane view = new VBox();
        view.getChildren().add(control_panel.render());
        view.getChildren().add(playlist_panel.render());
        view.getChildren().add(add_song_panel.render());

        return view;
    }
}
