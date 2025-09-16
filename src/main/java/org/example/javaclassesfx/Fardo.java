package org.example.javaclassesfx;

public class Fardo {
	private String material;
	private double peso;
	private double capacidade;

	public Fardo(String material, double peso, double capacidade) {
		this.material = material;
		this.peso = peso;
		this.capacidade = capacidade;
	}

	public void carregar_itens() {
		System.out.println("Fardo carregou itens");
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
