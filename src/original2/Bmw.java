package original2;

public class Bmw {
	
	private double velocidade;
	private double velocidadeMaxima;
	
	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void ligar(String comando) {
		System.out.println("BMW " + comando);
	}
	
	public void desligar(String comando) {
		System.out.println("BMW " + comando);
	}
	
	public void acelerar(String comando) {
		System.out.println("BMW " + comando);
	}
	
	public void freiar(String comando) {
		System.out.println("BMW " + comando);
	}
	
	public void abrirTetoSolar(String comando) {
		System.out.println("BMW " + comando);
	}
	
	public void ligarArCondicionado(String comando) {
		System.out.println("BMW " + comando);
	}

	public void ligarPilotoAutomatico(String comando) {
		System.out.println("BMW " + comando);	
	}
	
}
