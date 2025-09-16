package exercicio5;

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

	private double getArea() {
		return area;
	}

	private void setArea(double area) {
		this.area = area;
	}

	private int getQtd_pes() {
		return qtd_pes;
	}

	private void setQtd_pes(int qtd_pes) {
		this.qtd_pes = qtd_pes;
	}

	private String getMaterial() {
		return material;
	}

	private void setMaterial(String material) {
		this.material = material;
	}
}
