package com.comp301.mvc.inclass.view;

import com.comp301.mvc.inclass.controller.Controller;
import com.comp301.mvc.inclass.model.Playlist;
import com.comp301.mvc.inclass.model.PlaylistObserver;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class View implements FXComponent, PlaylistObserver {
    private ControlPanel control_panel;
    private PlaylistPanel playlist_panel;
    private AddSongPanel add_song_panel;
    private Stage stage;

    public View(Playlist playlist, Controller controller, Stage stage) {
        this.stage = stage;

        control_panel = new ControlPanel(controller);
        playlist_panel = new PlaylistPanel(playlist, controller);
        add_song_panel = new AddSongPanel(controller);

        playlist.addPlaylistObserver(this);

    }

    @Override
    public Parent render() {

        Pane view = new VBox();
        view.getChildren().add(control_panel.render());
        view.getChildren().add(playlist_panel.render());
        view.getChildren().add(add_song_panel.render());

        return view;
    }

    @Override
    public void update(Playlist playlist) {
       Scene scene = new Scene(render());
       stage.setScene(scene);

    }
}
