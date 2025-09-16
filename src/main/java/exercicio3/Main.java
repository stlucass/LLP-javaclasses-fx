package exercicio3;

public class Main {
	public static void main(String[] args) {
		FiguraHumana figurahumana1 = new FiguraHumana("Em pé", "Tristeza", "Maria");
		figurahumana1.carregar_fardo();

		Fardo fardo1 = new Fardo("Plástico", 30.5, 45);
		fardo1.carregar_itens();

		Lixo lixo1 = new Lixo("Reciclável", "Plástico", "Círculo");
		lixo1.poluir_ambiente();

	}
}