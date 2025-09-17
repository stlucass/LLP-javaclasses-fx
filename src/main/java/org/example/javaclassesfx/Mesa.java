package org.example.javaclassesfx;

public class Mesa {
	private String material;
	private int qtd_pes;
	private double area;

	public Mesa(String material, int qtd_pes, double area) {
		this.area = area;
		this.material = material;
		this.qtd_pes = qtd_pes;
	}

	public void suportar_itens() {
		System.out.println("Mesa suportou item.");
	}

	public void quebrar() {
		System.out.println("Mesa quebrou.");
	}

	public void dobrar() {
		System.out.println("Mesa dobrou.");
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
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
