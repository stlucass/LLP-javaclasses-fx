package exercicio4;

public class Pessoa {
    private String sexo;
    private String idade;
    private String nome;

    public Pessoa(String sexo, String idade, String nome) {
        this.sexo = sexo;
        this.idade = idade;
        this.nome = nome;
    }

    public void viver() {
        System.out.println(nome + " está vivendo.");
    }

    public void andar() {
        System.out.println(nome + " está andando.");
    }

    public void pular() {
        System.out.println(nome + " está pulando.");
    }
}
