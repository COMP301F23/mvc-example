package com.comp301.mvc.playlist;

import com.comp301.mvc.playlist.InitialPlaylist;
import com.comp301.mvc.playlist.controller.Controller;
import com.comp301.mvc.playlist.controller.ControllerImpl;
import com.comp301.mvc.playlist.model.Model;
import com.comp301.mvc.playlist.model.ModelImpl;
import com.comp301.mvc.playlist.model.Song;
import java.util.List;

import com.comp301.mvc.playlist.view.View;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
  @Override
  public void start(Stage stage) {
    // Model
    List<Song> songs = InitialPlaylist.create();
    Model model = new ModelImpl(songs);

    // Controller
    Controller controller = new ControllerImpl(model);

    // View
    View view = new View(controller);

    // Make scene
    Scene scene = new Scene(view.render());
    scene.getStylesheets().add("main.css");
    stage.setScene(scene);

    // Refresh view when model changes
    model.addObserver((Model m) -> {
      scene.setRoot(view.render());
      stage.sizeToScene();
    });

    // Show the stage
    stage.setTitle("Playlist View Example");
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
