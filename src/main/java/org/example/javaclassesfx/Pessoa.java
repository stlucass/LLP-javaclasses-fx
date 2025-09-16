package org.example.javaclassesfx;

public class Pessoa {
    private String sexo;
    private String idade;
    private String nome;

    public Pessoa(String sexo, String idade, String nome) {
        this.setSexo(sexo);
        this.setIdade(idade);
        this.setNome(nome);
    }

    public void viver() {
        System.out.println(getNome() + " está vivendo.");
    }

    public void andar() {
        System.out.println(getNome() + " está andando.");
    }

    public void pular() {
        System.out.println(getNome() + " está pulando.");
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

