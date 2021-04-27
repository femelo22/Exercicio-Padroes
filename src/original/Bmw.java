package original;

public class Bmw implements Carro {
	
	private double velocidade = 0;
	private double velocidadeMaxima = 300;
	
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
	
	public void acelerar(double velocidade) {
		this.velocidade += velocidade;
		if(velocidade < this.velocidadeMaxima) {
			System.out.println("BMW acelerando " + velocidade + "Km/h");
		} else {			
			System.out.println("Velocidade máxima atingida");
		}
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
	
	@Override
	public void ligarRadio(String comando) {
		//NÃO POSSUI
	}
	
}
