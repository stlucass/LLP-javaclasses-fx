package org.example.javaclassesfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;

public class FardoController {
    @FXML
    private TextField tfMaterial;
    @FXML
    private TextField tfPeso;
    @FXML
    private TextField tfCapacidade;

    @FXML
    protected void onSalvarButtonClick() {
        try {
            String material = tfMaterial.getText();
            double peso = Double.parseDouble(tfPeso.getText());
            double capacidade = Double.parseDouble(tfCapacidade.getText());
            Fardo novoFardo = new Fardo(material, peso, capacidade);
            salvarEmCSV(novoFardo);
            tfMaterial.clear();
            tfPeso.clear();
            tfCapacidade.clear();
        } catch (NumberFormatException e) {
            System.err.println("Erro: Peso e capacidade devem ser números válidos.");
        }
    }

    private void salvarEmCSV(Fardo fardo) {
        String caminhoArquivo = "fardos.csv";
        boolean adicionar = true;

        try (FileWriter escritor = new FileWriter(caminhoArquivo, adicionar)) {
            if (new java.io.File(caminhoArquivo).length() == 0) {
                escritor.append("material,peso,capacidade\n");
            }
            escritor.append(String.format("%s,%.2f,%.2f\n", fardo.getMaterial(), fardo.getPeso(), fardo.getCapacidade()));
            System.out.println("Objeto Fardo salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar no arquivo CSV: " + e.getMessage());
        }
    }
}