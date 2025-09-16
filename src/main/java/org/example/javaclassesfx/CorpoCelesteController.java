package org.example.javaclassesfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;

public class CorpoCelesteController {

    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfPosicao;
    @FXML
    private TextField tfVelocidadeRotacao;

    @FXML
    protected void onSalvarButtonClick() {
        try {
            String nome = tfNome.getText();
            String posicao = tfPosicao.getText();
            String velocidade_rotacao = tfVelocidadeRotacao.getText();

            CorpoCeleste novoCorpoCeleste = new CorpoCeleste(nome, posicao, velocidade_rotacao);

            salvarEmCSV(novoCorpoCeleste);

            tfNome.clear();
            tfPosicao.clear();
            tfVelocidadeRotacao.clear();

        } catch (NumberFormatException e) {
            System.err.println("Erro: A velocidade de rotação deve ser um número.");
        }
    }

    private void salvarEmCSV(CorpoCeleste corpoCeleste) {
        String caminhoArquivo = "corposcelestes.csv";
        boolean adicionar = true;

        try (FileWriter escritor = new FileWriter(caminhoArquivo, adicionar)) {
            if (new java.io.File(caminhoArquivo).length() == 0) {
                escritor.append("nome,posicao,velocidade_rotacao\n");
            }
            escritor.append(String.format("%s,%s,%s\n", corpoCeleste.getNome(), corpoCeleste.getPosicao(), corpoCeleste.getVelocidade_rotacao()));
            System.out.println("Objeto CorpoCeleste salvo com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar no arquivo CSV: " + e.getMessage());
        }
    }
}