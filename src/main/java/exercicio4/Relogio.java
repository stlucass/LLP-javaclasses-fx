package exercicio4;

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

	private int getQtd_ponteiros() {
		return qtd_ponteiros;
	}

	private void setQtd_ponteiros(int qtd_ponteiros) {
		this.qtd_ponteiros = qtd_ponteiros;
	}

	private String getTamanho() {
		return tamanho;
	}

	private void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	private String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
