package org.example.javaclassesfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;

public class LixoController {
    @FXML
    private TextField tfCategoria;
    @FXML
    private TextField tfMaterial;
    @FXML
    private TextField tfForma;

    @FXML
    protected void onSalvarButtonClick() {
        String categoria = tfCategoria.getText();
        String material = tfMaterial.getText();
        String forma = tfForma.getText();
        Lixo novoLixo = new Lixo(categoria, material, forma);
        salvarEmCSV(novoLixo);
        tfCategoria.clear();
        tfMaterial.clear();
        tfForma.clear();
    }

    private void salvarEmCSV(Lixo lixo) {
        String caminhoArquivo = "lixo.csv";
        boolean adicionar = true;

        try (FileWriter escritor = new FileWriter(caminhoArquivo, adicionar)) {
            if (new java.io.File(caminhoArquivo).length() == 0) {
                escritor.append("categoria,material,forma\n");
            }
            escritor.append(String.format("%s,%s,%s\n", lixo.getCategoria(), lixo.getMaterial(), lixo.getForma()));
            System.out.println("Objeto Lixo salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar no arquivo CSV: " + e.getMessage());
        }
    }
}