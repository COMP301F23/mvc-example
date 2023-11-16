package com.comp301.mvc.inclass.view;

import com.comp301.mvc.inclass.controller.Controller;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ControlPanel implements FXComponent {
    private Controller controller;

    public ControlPanel(Controller controller) {
        this.controller = controller;
    }
    public Parent render() {
        StackPane ctrl_panel = new StackPane();
        Button shuffle = new Button("Shuffle");
        shuffle.setOnAction((ActionEvent e ) -> {
            controller.shuffle();
        });

        ctrl_panel.getChildren().add(shuffle);
        return ctrl_panel;
    }
}
