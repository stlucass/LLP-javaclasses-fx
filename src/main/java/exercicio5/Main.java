package exercicio5;

public class Main {
    public static void main(String[] args) {
        Cadeira cadeira1 = new Cadeira("Luxo", 4, "Madeira");
        cadeira1.dobrar();

        Mesa mesa1 = new Mesa("Madeira", 4, 4);
        mesa1.dobrar();

        Pessoa pessoa1 = new Pessoa("Feminino", 30, "Maria");
        pessoa1.falar();
    }
}
