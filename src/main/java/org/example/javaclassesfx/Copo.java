package org.example.javaclassesfx;

public class Copo {
	private String material;
	private String preenchimento;
	private double capacidade;

	public Copo(String material, String preenchimento, double capacidade) {
		this.material = material;
		this.preenchimento = preenchimento;
		this.capacidade = capacidade;
	}

	public void carregar_liquido() {
		System.out.println("O copo está sendo preenchido com " + preenchimento);
	}

	public void quebrar() {
		System.out.println("O copo de " + material + " quebrou.");
	}

	public void ser_preenchido() {
		System.out.println("O copo foi preenchido.");
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	public String getPreenchimento() {
		return preenchimento;
	}

	public void setPreenchimento(String preenchimento) {
		this.preenchimento = preenchimento;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}