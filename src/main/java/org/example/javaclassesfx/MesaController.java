package org.example.javaclassesfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;

public class MesaController {
    @FXML
    private TextField tfMaterial;
    @FXML
    private TextField tfQtdPes;
    @FXML
    private TextField tfArea;

    @FXML
    protected void onSalvarButtonClick() {
        try {
            String material = tfMaterial.getText();
            int qtdPes = Integer.parseInt(tfQtdPes.getText());
            double area = Double.parseDouble(tfArea.getText());
            Mesa novaMesa = new Mesa(material, qtdPes, area);
            salvarEmCSV(novaMesa);
            tfMaterial.clear();
            tfQtdPes.clear();
            tfArea.clear();
        } catch (NumberFormatException e) {
            System.err.println("Erro: Quantidade de pés e área devem ser números válidos.");
        }
    }

    private void salvarEmCSV(Mesa mesa) {
        String caminhoArquivo = "mesas.csv";
        boolean adicionar = true;

        try (FileWriter escritor = new FileWriter(caminhoArquivo, adicionar)) {
            if (new java.io.File(caminhoArquivo).length() == 0) {
                escritor.append("material,qtd_pes,area\n");
            }
            escritor.append(String.format("%s,%d,%.2f\n", mesa.getMaterial(), mesa.getQtd_pes(), mesa.getArea()));
            System.out.println("Objeto Mesa salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar no arquivo CSV: " + e.getMessage());
        }
    }
}