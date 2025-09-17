package org.example.javaclassesfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;

public class CadeiraController {
    @FXML
    private TextField tfModelo;
    @FXML
    private TextField tfQtdPes;
    @FXML
    private TextField tfMaterial;

    @FXML
    protected void onSalvarButtonClick() {
        try {
            String modelo = tfModelo.getText();
            int qtdPes = Integer.parseInt(tfQtdPes.getText());
            String material = tfMaterial.getText();
            Cadeira novaCadeira = new Cadeira(modelo, qtdPes, material);
            salvarEmCSV(novaCadeira);
            tfModelo.clear();
            tfQtdPes.clear();
            tfMaterial.clear();
        } catch (NumberFormatException e) {
            System.err.println("Erro: A quantidade de pés deve ser um número inteiro.");
        }
    }

    private void salvarEmCSV(Cadeira cadeira) {
        String caminhoArquivo = "cadeiras.csv";
        boolean adicionar = true;

        try (FileWriter escritor = new FileWriter(caminhoArquivo, adicionar)) {
            if (new java.io.File(caminhoArquivo).length() == 0) {
                escritor.append("modelo,qtd_pes,material\n");
            }
            escritor.append(String.format("%s,%d,%s\n", cadeira.getModelo(), cadeira.getQtd_pes(), cadeira.getMaterial()));
            System.out.println("Objeto Cadeira salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar no arquivo CSV: " + e.getMessage());
        }
    }
}