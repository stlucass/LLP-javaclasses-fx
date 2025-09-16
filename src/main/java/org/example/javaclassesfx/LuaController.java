package org.example.javaclassesfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;

public class LuaController {

    @FXML
    private TextField tfFase;
    @FXML
    private TextField tfIluminacao;
    @FXML
    private TextField tfInfluencia;

    @FXML
    protected void onSalvarButtonClick() {
        // Não é mais necessário o 'try-catch' para NumberFormatException, pois não há conversão para número
        String fase = tfFase.getText();
        String iluminacao = tfIluminacao.getText(); // Apenas pega o texto
        String influencia = tfInfluencia.getText();

        Lua novaLua = new Lua(fase, iluminacao, influencia);

        salvarEmCSV(novaLua);

        tfFase.clear();
        tfIluminacao.clear();
        tfInfluencia.clear();
    }

    private void salvarEmCSV(Lua lua) {
        String caminhoArquivo = "luas.csv";
        boolean adicionar = true;

        try (FileWriter escritor = new FileWriter(caminhoArquivo, adicionar)) {
            if (new java.io.File(caminhoArquivo).length() == 0) {
                escritor.append("fase,iluminacao,influencia\n");
            }

            // A linha abaixo foi corrigida para usar '%s' em vez de '%d' para a iluminação
            escritor.append(String.format("%s,%s,%s\n", lua.getFase(), lua.getIluminacao(), lua.getInfluencia()));
            System.out.println("Objeto Lua salvo com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar no arquivo CSV: " + e.getMessage());
        }
    }
}