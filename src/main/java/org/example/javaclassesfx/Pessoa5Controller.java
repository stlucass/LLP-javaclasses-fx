package org.example.javaclassesfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;

public class Pessoa5Controller {
    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfSexo;
    @FXML
    private TextField tfIdade;

    @FXML
    protected void onSalvarButtonClick() {
        try {
            String nome = tfNome.getText();
            String sexo = tfSexo.getText();
            int idade = Integer.parseInt(tfIdade.getText());
            Pessoa5 novaPessoa = new Pessoa5(sexo, idade, nome);
            salvarEmCSV(novaPessoa);
            tfNome.clear();
            tfSexo.clear();
            tfIdade.clear();
        } catch (NumberFormatException e) {
            System.err.println("Erro: A idade deve ser um número inteiro.");
        }
    }

    private void salvarEmCSV(Pessoa5 pessoa5) {
        String caminhoArquivo = "pessoas5.csv";
        boolean adicionar = true;

        try (FileWriter escritor = new FileWriter(caminhoArquivo, adicionar)) {
            if (new java.io.File(caminhoArquivo).length() == 0) {
                escritor.append("nome,sexo,idade\n");
            }
            escritor.append(String.format("%s,%s,%d\n", pessoa5.getNome(), pessoa5.getSexo(), pessoa5.getIdade()));
            System.out.println("Objeto Pessoa5 salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar no arquivo CSV: " + e.getMessage());
        }
    }
}