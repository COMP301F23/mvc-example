package com.comp301.lec20.inclass.view;

import com.comp301.lec20.inclass.controller.Controller;
import com.comp301.lec20.inclass.model.Song;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class SongView {
    private Controller controller;
    private int index;

    public SongView(Controller controller, int index) {
        this.controller = controller;
        this.index = index;
    }

    public Parent render() {
        HBox layout = new HBox();

        // Delete button
        Button deleteButton = new Button("\u274C");
        layout.getChildren().add(deleteButton);

        // Up button
        Button upButton = new Button("\u25B2");
        layout.getChildren().add(upButton);

        // Down button
        Button downButton = new Button("\u25BC");
        layout.getChildren().add(downButton);

        // Title
        Label title = new Label(makeLabelString());
        layout.getChildren().add(title);

        return layout;
    }

    private String makeLabelString() {
        Song song = controller.getSong(index);
        return song.getTitle() + " by " + song.getArtist() +
                " (" + makeRating() + ")";
    }

    private String makeRating() {
        Song song = controller.getSong(index);
        int ratingInt = song.getRating();
        String ratingString = "";
        for (int i = 0; i < ratingInt; i++) {
            ratingString += "\u2605";
        }
        for (int i = ratingInt; i < 5; i++) {
            ratingString += "\u2606";
        }
        return ratingString;
    }

}
