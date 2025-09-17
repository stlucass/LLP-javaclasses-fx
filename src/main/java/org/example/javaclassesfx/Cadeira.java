package org.example.javaclassesfx;

public class Cadeira {
	private String modelo;
	private int qtd_pes;
	private String material;

	public Cadeira(String modelo, int qtd_pes, String material) {
		this.modelo = modelo;
		this.qtd_pes = qtd_pes;
		this.material = material;
	}

	public void suportar_itens() {
		System.out.println("Cadeira suportou item.");
	}

	public void quebrar() {
		System.out.println("Cadeira quebrou.");
	}

	public void dobrar() {
		System.out.println("Cadeira dobrou.");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQtd_pes() {
		return qtd_pes;
	}

	public void setQtd_pes(int qtd_pes) {
		this.qtd_pes = qtd_pes;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
