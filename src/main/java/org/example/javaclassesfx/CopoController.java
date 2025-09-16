package org.example.javaclassesfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;

public class CopoController {
    @FXML
    private TextField tfMaterial;
    @FXML
    private TextField tfPreenchimento;
    @FXML
    private TextField tfCapacidade;

    @FXML
    protected void onSalvarButtonClick() {
        try {
            String material = tfMaterial.getText();
            String preenchimento = tfPreenchimento.getText();
            double capacidade = Double.parseDouble(tfCapacidade.getText());
            Copo novoCopo = new Copo(material, preenchimento, capacidade);
            salvarEmCSV(novoCopo);
            tfMaterial.clear();
            tfPreenchimento.clear();
            tfCapacidade.clear();
        } catch (NumberFormatException e) {
            System.err.println("Erro: A capacidade deve ser um número válido.");
        }
    }

    private void salvarEmCSV(Copo copo) {
        String caminhoArquivo = "copos.csv";
        boolean adicionar = true;

        try (FileWriter escritor = new FileWriter(caminhoArquivo, adicionar)) {
            if (new java.io.File(caminhoArquivo).length() == 0) {
                escritor.append("material,preenchimento,capacidade\n");
            }
            escritor.append(String.format("%s,%s,%.2f\n", copo.getMaterial(), copo.getPreenchimento(), copo.getCapacidade()));
            System.out.println("Objeto Copo salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar no arquivo CSV: " + e.getMessage());
        }
    }
}