package org.example.javaclassesfx;

public class Relogio {
	private String modelo;
	private String tamanho;
	private int qtd_ponteiros;

	public Relogio(String modelo, String tamanho, int qtd_ponteiros) {
		this.setModelo(modelo);
		this.setTamanho(tamanho);
		this.setQtd_ponteiros(qtd_ponteiros);
	}

	public void marcar_minutos() {
		System.out.println("O relógio está marcando os minutos.");
	}

	public void marcar_horas() {
		System.out.println("O relógio está marcando as horas.");
	}

	public void girar_ponteiros() {
		System.out.println("Os ponteiros do relógio estão girando.");
	}

	public int getQtd_ponteiros() {
		return qtd_ponteiros;
	}

	public void setQtd_ponteiros(int qtd_ponteiros) {
		this.qtd_ponteiros = qtd_ponteiros;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
