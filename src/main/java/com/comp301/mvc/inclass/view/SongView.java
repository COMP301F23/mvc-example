package com.comp301.mvc.inclass.view;

import com.comp301.mvc.inclass.controller.Controller;
import com.comp301.mvc.inclass.model.Song;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class SongView implements FXComponent {

    private Song song;
    private Controller controller;
    private int song_index;

    public SongView(Song song, int song_index, Controller controller) {
        this.song = song;
        this.controller = controller;
        this.song_index = song_index;
    }

    public Parent render() {
        Pane hbox = new HBox();
        Button deleteButton = new Button("\u274C");
        deleteButton.setOnAction((ActionEvent e) -> {
            controller.deleteSong(song_index);
        });

        Button upButton = new Button("\u25B2");
        upButton.setOnAction((ActionEvent e) -> {
            controller.moveSongUp(song_index);
        });

        Button downButton = new Button("\u25BC");
        downButton.setOnAction((ActionEvent e) -> {
            controller.moveSongDown(song_index);
        });
        Label songLabel = new Label(makeSongLabel());

        ObservableList<Node> hbox_children = hbox.getChildren();

        hbox_children.add(deleteButton);
        hbox_children.add(upButton);
        hbox_children.add(downButton);
        hbox_children.add(songLabel);

        return hbox;
    }

    private String makeSongLabel() {
        String label = "";
        label += song.getTitle() + " by "
                + song.getArtist() + " (";
        for (int i=0; i<song.getRating(); i++) {
            label += "\u2605";
        }
        for (int i=song.getRating(); i<5; i++) {
            label += "\u2606";
        }
        label += ")";
        return label;
    }
}
