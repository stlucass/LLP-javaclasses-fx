package exercicio3;

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

	private String getForma() {
		return forma;
	}

	private void setForma(String forma) {
		this.forma = forma;
	}

	private String getMaterial() {
		return material;
	}

	private void setMaterial(String material) {
		this.material = material;
	}

	private String getCategoria() {
		return categoria;
	}

	private void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}