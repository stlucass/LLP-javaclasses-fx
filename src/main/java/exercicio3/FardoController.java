package exercicio3;
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

        } catch(NumberFormatException e) {
            System.out.println("Erro ao converter o valor. Verifique se peso e capacidade são números válidos.");
        }
    }

    private void salvarEmCSV(Fardo novoFardo) {
        String caminhoArquivo = "fardos.csv";
        boolean adicionar = true;

        try(FileWriter escritor = new FileWriter(caminhoArquivo, adicionar)){
            if(new java.io.File(caminhoArquivo).length() == 0){
                escritor.append("material, peso, capacidade\n");
            }

            // Usando a variável 'novoFardo' e passando todos os parâmetros corretamente
            escritor.append(String.format("%s, %.2f, %.2f\n", novoFardo.getMaterial(), novoFardo.getPeso(), novoFardo.getCapacidade()));

            System.out.println("Objeto Fardo salvo com sucesso!");

        } catch(IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar no arquivo CSV: " + e.getMessage());
        }
    }
}