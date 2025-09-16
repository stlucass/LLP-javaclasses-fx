package org.example.javaclassesfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class MenuPrincipalController {

    public void abrirTelaLua(ActionEvent event) {
        abrirNovaJanela("lua-view.fxml", "Cadastro de Lua");
    }

    public void abrirTelaPele(ActionEvent event) {
        abrirNovaJanela("pele-view.fxml", "Cadastro de Pele");
    }

    public void abrirTelaCorpoCeleste(ActionEvent event) {
        abrirNovaJanela("corpoceleste-view.fxml", "Cadastro de Corpo Celeste");
    }

    private void abrirNovaJanela(String fxmlPath, String titulo) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/javaclassesfx/" + fxmlPath));
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