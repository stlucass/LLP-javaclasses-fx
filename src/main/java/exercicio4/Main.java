package exercicio4;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Masculino", "18", "Lucas");
        pessoa1.viver();

        Relogio relogio1 = new Relogio("Digital", "18 cm", 3);
        relogio1.marcar_horas();

        Copo copo1 = new Copo("Vidro", "Suco", 200);
        copo1.carregar_liquido();

    }
}