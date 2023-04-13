package com.comp301.lec20.inclass.view;

import javafx.scene.Parent;
import javafx.scene.layout.HBox;
import com.comp301.lec20.inclass.controller.Controller;
import javafx.scene.layout.VBox;

public class View {
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
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
}
