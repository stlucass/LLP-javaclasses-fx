package org.example.javaclassesfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;

public class PeleController {

    @FXML
    private TextField tfSensibilidade;
    @FXML
    private TextField tfTemperatura;
    @FXML
    private TextField tfTextura;

    @FXML
    protected void onSalvarButtonClick() {
        try {
            String sensibilidade = tfSensibilidade.getText();
            double temperatura = Double.parseDouble(tfTemperatura.getText());
            String textura = tfTextura.getText();

            Pele novaPele = new Pele(sensibilidade, temperatura, textura);

            salvarEmCSV(novaPele);

            tfSensibilidade.clear();
            tfTemperatura.clear();
            tfTextura.clear();

        } catch (NumberFormatException e) {
            System.err.println("Erro: A temperatura deve ser um número.");
        }
    }

    private void salvarEmCSV(Pele pele) {
        String caminhoArquivo = "pele.csv";
        boolean adicionar = true;

        try (FileWriter escritor = new FileWriter(caminhoArquivo, adicionar)) {
            if (new java.io.File(caminhoArquivo).length() == 0) {
                escritor.append("sensibilidade,temperatura,textura\n");
            }
            escritor.append(String.format("%s,%.2f,%s\n", pele.getSensibilidade(), pele.getTemperatura(), pele.getTextura()));
            System.out.println("Objeto Pele salvo com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar no arquivo CSV: " + e.getMessage());
        }
    }
}