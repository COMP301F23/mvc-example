package com.comp301.lec20.inclass;

import com.comp301.lec20.inclass.controller.Controller;
import com.comp301.lec20.inclass.controller.ControllerImpl;
import com.comp301.lec20.inclass.model.Playlist;
import com.comp301.lec20.inclass.model.PlaylistImpl;
import com.comp301.lec20.inclass.view.View;
import com.comp301.lec20.playlist.model.Model;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    static public void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        Playlist playlist = new PlaylistImpl();
        Controller controller = new ControllerImpl(playlist);
        View view = new View(controller, stage);

        stage.setTitle("Playlist View Example");

        view.update(playlist);

        // Show the stage
        stage.show();

    }
}
