package com.hlem.construments.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.SplitPane;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;

@Component
public class MainSceneController {
    @FXML
    private SplitPane splitPane;

    public void createProject(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/fxml/createProject.fxml");
        loader.setLocation(xmlUrl);
        splitPane.getItems().set(1, loader.load());
    }
}
