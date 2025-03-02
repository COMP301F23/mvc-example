package com.comp301.mvc.inclass.view;

import com.comp301.mvc.inclass.controller.Controller;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class AddSongPanel implements FXComponent {

    private Controller controller;

    public AddSongPanel(Controller controller) {
        this.controller = controller;
    }

    public Parent render() {
        Pane layout = new HBox();

        // Title
        final TextField titleInput = new TextField();
        layout.getChildren().add(new Label("Song:"));
        layout.getChildren().add(titleInput);

        // Artist
        final TextField artistInput = new TextField();
        layout.getChildren().add(new Label("Artist:"));
        layout.getChildren().add(artistInput);

        // Rating
        final Slider ratingSlider = new Slider(0, 5, 5);
        layout.getChildren().add(new Label("Rating:"));
        layout.getChildren().add(ratingSlider);

        // Add button
        Button addButton = new Button("\uff0b");

        addButton.setOnAction((ActionEvent e) -> {
            String title = titleInput.getText();
            String artist = artistInput.getText();
            int rating = (int) ratingSlider.getValue();

            controller.addSong(title, artist, rating);
        });

        layout.getChildren().add(addButton);

        return layout;

    }
}
