package org.example.javaclassesfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Exercicio3MenuController {

    private final String FXML_PATH = "/org/example/javaclassesfx/";

    public void abrirTelaLixo(ActionEvent event) {
        abrirNovaJanela("lixo-view.fxml", "Cadastro de Lixo");
    }

    public void abrirTelaFiguraHumana(ActionEvent event) {
        abrirNovaJanela("figura-humana-view.fxml", "Cadastro de Figura Humana");
    }

    public void abrirTelaFardo(ActionEvent event) {
        abrirNovaJanela("fardo-view.fxml", "Cadastro de Fardo");
    }

    private void abrirNovaJanela(String fxmlPath, String titulo) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXML_PATH + fxmlPath));
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