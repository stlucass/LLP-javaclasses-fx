package org.example.javaclassesfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;

public class PessoaController {
    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfSexo;
    @FXML
    private TextField tfIdade;

    @FXML
    protected void onSalvarButtonClick() {
        String nome = tfNome.getText();
        String sexo = tfSexo.getText();
        String idade = tfIdade.getText();
        Pessoa novaPessoa = new Pessoa(nome, sexo, idade);
        salvarEmCSV(novaPessoa);
        tfNome.clear();
        tfSexo.clear();
        tfIdade.clear();
    }

    private void salvarEmCSV(Pessoa pessoa) {
        String caminhoArquivo = "pessoas.csv";
        boolean adicionar = true;

        try (FileWriter escritor = new FileWriter(caminhoArquivo, adicionar)) {
            if (new java.io.File(caminhoArquivo).length() == 0) {
                escritor.append("nome,sexo,idade\n");
            }
            escritor.append(String.format("%s,%s,%s\n", pessoa.getNome(), pessoa.getSexo(), pessoa.getIdade()));
            System.out.println("Objeto Pessoa salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar no arquivo CSV: " + e.getMessage());
        }
    }
}