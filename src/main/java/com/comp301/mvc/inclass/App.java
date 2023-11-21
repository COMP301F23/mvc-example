package com.comp301.mvc.inclass;

import com.comp301.mvc.inclass.controller.Controller;
import com.comp301.mvc.inclass.controller.ControllerImpl;
import com.comp301.mvc.inclass.model.Playlist;
import com.comp301.mvc.inclass.model.PlaylistImpl;
import com.comp301.mvc.inclass.model.PlaylistObserver;
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
        playlist.addSong(new SongImpl("Buy Her Candy", "Sleater Kinney", 5), 0);
        playlist.addSong(new SongImpl("Cigarette Daydreams", "Cage The Elephant", 4), 0);

        Controller controller = new ControllerImpl(playlist);
        PlaylistObserver view = new View(playlist, controller, stage);

        stage.setTitle("Playlist View Example");

        view.update(playlist);
//        Scene scene = new Scene(view.render());
  //      stage.setScene(scene);

        // Show the stage
        stage.show();

    }
}
