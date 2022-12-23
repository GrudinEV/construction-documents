package com.hlem.construments;

import com.hlem.construments.MainWindowApplication.StageReadyEvent;
import com.hlem.construments.controller.MainSceneController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.net.URL;


@Component
@RequiredArgsConstructor
public class StageInitializer implements ApplicationListener<StageReadyEvent> {
    private final MainSceneController controller;
    @SneakyThrows
    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/fxml/mainScene.fxml");
        loader.setLocation(xmlUrl);
        Parent root = loader.load();
        Stage stage = event.getStage();
        stage.setScene(new Scene(root));
        stage.setMinWidth(800);
        stage.setMinHeight(500);
        stage.show();
    }
}
