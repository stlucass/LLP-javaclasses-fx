package org.example.javaclassesfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainMenuController {

    private final String FXML_PACKAGE_PATH = "/org/example/javaclassesfx/";

    public void abrirMenuExercicio2(ActionEvent event) {
        abrirNovaJanela("exercicio2-view.fxml", "Menu Exercício 2");
    }

    public void abrirMenuExercicio3(ActionEvent event) {
        abrirNovaJanela("exercicio3-view.fxml", "Menu Exercício 3");
    }

    public void abrirMenuExercicio4(ActionEvent event) {
        abrirNovaJanela("exercicio4-view.fxml", "Menu Exercício 4");
    }

    public void abrirMenuExercicio5(ActionEvent event) {
        abrirNovaJanela("exercicio5-view.fxml", "Menu Exercício 5");
    }

    private void abrirNovaJanela(String fxmlPath, String titulo) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXML_PACKAGE_PATH + fxmlPath));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle(titulo);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao carregar a janela: " + e.getMessage());
        }
    }
}