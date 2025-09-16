package org.example.javaclassesfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Exercicio4MenuController {

    private final String FXML_PATH = "/org/example/javaclassesfx/";

    public void abrirTelaRelogio(ActionEvent event) {
        abrirNovaJanela("relogio-view.fxml", "Cadastro de Relógio");
    }

    public void abrirTelaPessoa(ActionEvent event) {
        abrirNovaJanela("pessoa-view.fxml", "Cadastro de Pessoa");
    }

    public void abrirTelaCopo(ActionEvent event) {
        abrirNovaJanela("copo-view.fxml", "Cadastro de Copo");
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