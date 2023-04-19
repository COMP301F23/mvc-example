package com.comp301.lec20.inclass.view;

import com.comp301.lec20.inclass.controller.Controller;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ControlsView {
    private Controller controller;

    public ControlsView(Controller controller) {
        this.controller = controller;
    }

    public Parent render() {
        StackPane layout = new StackPane();

        Button shuffle = new Button("Shuffle");
        layout.getChildren().add(shuffle);
        shuffle.setOnAction((ActionEvent e) -> {
            controller.shuffle();
        });

        return layout;
    }
}
