package com.comp301.mvc.inclass;

import com.comp301.mvc.inclass.controller.Controller;
import com.comp301.mvc.inclass.controller.ControllerImpl;
import com.comp301.mvc.inclass.model.Playlist;
import com.comp301.mvc.inclass.model.PlaylistImpl;
import com.comp301.mvc.inclass.model.SongImpl;
import com.comp301.mvc.inclass.view.View;
import com.comp301.mvc.inclass.view.FXComponent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    static public void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {

        Playlist playlist = new PlaylistImpl();
        playlist.addSong(new SongImpl("Simulation Swarm", "Big Thief", 5), 0);

        Controller controller = new ControllerImpl(playlist);
        FXComponent view = new View(playlist, controller);

        stage.setTitle("Playlist View Example");

        Scene scene = new Scene(view.render());
        stage.setScene(scene);

        // Show the stage
        stage.show();

    }
}
