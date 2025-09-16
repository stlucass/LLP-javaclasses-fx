package org.example.javaclassesfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;

public class RelogioController {
    @FXML
    private TextField tfModelo;
    @FXML
    private TextField tfTamanho;
    @FXML
    private TextField tfQtdPonteiros;

    @FXML
    protected void onSalvarButtonClick() {
        try {
            String modelo = tfModelo.getText();
            String tamanho = tfTamanho.getText();
            int qtdPonteiros = Integer.parseInt(tfQtdPonteiros.getText());
            Relogio novoRelogio = new Relogio(modelo, tamanho, qtdPonteiros);
            salvarEmCSV(novoRelogio);
            tfModelo.clear();
            tfTamanho.clear();
            tfQtdPonteiros.clear();
        } catch (NumberFormatException e) {
            System.err.println("Erro: A quantidade de ponteiros deve ser um número inteiro.");
        }
    }

    private void salvarEmCSV(Relogio relogio) {
        String caminhoArquivo = "relogios.csv";
        boolean adicionar = true;

        try (FileWriter escritor = new FileWriter(caminhoArquivo, adicionar)) {
            if (new java.io.File(caminhoArquivo).length() == 0) {
                escritor.append("modelo,tamanho,qtd_ponteiros\n");
            }
            escritor.append(String.format("%s,%s,%d\n", relogio.getModelo(), relogio.getTamanho(), relogio.getQtd_ponteiros()));
            System.out.println("Objeto Relogio salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar no arquivo CSV: " + e.getMessage());
        }
    }
}