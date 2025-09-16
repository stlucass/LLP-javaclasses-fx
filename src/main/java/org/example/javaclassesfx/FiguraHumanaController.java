package org.example.javaclassesfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;

public class FiguraHumanaController {
    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfPosicaoCorporal;
    @FXML
    private TextField tfExpressaoFacial;

    @FXML
    protected void onSalvarButtonClick() {
        String nome = tfNome.getText();
        String posicaoCorporal = tfPosicaoCorporal.getText();
        String expressaoFacial = tfExpressaoFacial.getText();
        FiguraHumana novaFiguraHumana = new FiguraHumana(posicaoCorporal, expressaoFacial, nome);
        salvarEmCSV(novaFiguraHumana);
        tfNome.clear();
        tfPosicaoCorporal.clear();
        tfExpressaoFacial.clear();
    }

    private void salvarEmCSV(FiguraHumana figuraHumana) {
        String caminhoArquivo = "figuras_humanas.csv";
        boolean adicionar = true;

        try (FileWriter escritor = new FileWriter(caminhoArquivo, adicionar)) {
            if (new java.io.File(caminhoArquivo).length() == 0) {
                escritor.append("nome,posicao_corporal,expressao_facial\n");
            }
            escritor.append(String.format("%s,%s,%s\n", figuraHumana.getNome(), figuraHumana.getPosicao_corporal(), figuraHumana.getExpressao_facial()));
            System.out.println("Objeto FiguraHumana salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar no arquivo CSV: " + e.getMessage());
        }
    }
}