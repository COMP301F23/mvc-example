package com.comp301.lec20.inclass.view;

import com.comp301.lec20.inclass.model.Playlist;
import com.comp301.lec20.inclass.model.PlaylistObserver;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import com.comp301.lec20.inclass.controller.Controller;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View implements PlaylistObserver {
    private Controller controller;
    private Stage stage;

    public View(Controller controller, Stage stage) {
        this.controller = controller;
        this.stage = stage;
        controller.addPlaylistObserver(this);
    }

    public Parent render() {
        VBox layout = new VBox();


        ControlsView cv = new ControlsView(controller);
        PlaylistView pv = new PlaylistView(controller);
        AddSongView asv = new AddSongView(controller);

        layout.getChildren().add(cv.render());
        layout.getChildren().add(pv.render());
        layout.getChildren().add(asv.render());

        return layout;
    }

    @Override
    public void update(Playlist playlist) {
        Scene scene = new Scene(render());
        scene.getStylesheets().add("main.css");
        stage.setScene(scene);
    }
}
