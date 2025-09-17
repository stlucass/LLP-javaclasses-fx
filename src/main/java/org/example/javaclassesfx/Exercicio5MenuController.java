package org.example.javaclassesfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Exercicio5MenuController {

    private final String FXML_PATH = "/org/example/javaclassesfx/";

    public void abrirTelaCadeira(ActionEvent event) {
        abrirNovaJanela("cadeira-view.fxml", "Cadastro de Cadeira");
    }

    public void abrirTelaMesa(ActionEvent event) {
        abrirNovaJanela("mesa-view.fxml", "Cadastro de Mesa");
    }

    public void abrirTelaPessoa5(ActionEvent event) {
        abrirNovaJanela("pessoa5-view.fxml", "Cadastro de Pessoa");
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