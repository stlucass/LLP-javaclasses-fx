package org.example.javaclassesfx;

public class Lixo {
	private String categoria;
	private String material;
	private String forma;

	public Lixo(String categoria, String material, String forma) {
		this.categoria = categoria;
		this.material = material;
		this.forma = forma;
	}

	public void poluir_ambiente() {
		System.out.println("Lixo poluiu ambiente.");
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}