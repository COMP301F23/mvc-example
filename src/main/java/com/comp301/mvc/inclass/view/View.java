package com.comp301.mvc.inclass.view;

import javafx.scene.Parent;
import javafx.scene.layout.VBox;

public class View implements FXComponent {
    @Override
    public Parent render() {
        return new VBox();
    }
}
