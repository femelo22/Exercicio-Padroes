package original;

public class Fiat implements Carro {
	
	private double velocidade = 0;
	private double velocidadeMaxima = 180;
	
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
		System.out.println("Fiat " + comando);
	}
	
	public void desligar(String comando) {
		System.out.println("Fiat " + comando);
	}
	
	public void acelerar(double velocidade) {
		this.velocidade += velocidade;
		if(velocidade < this.velocidadeMaxima) {
			System.out.println("Fiat acelerando " + velocidade + "Km/h");
		}else {
			System.out.println("Velocidade máxima atingida");
		}
	}
	
	public void freiar(String comando) {
		System.out.println("Fiat " + comando);
	}
	
	public void ligarRadio(String comando) {
		System.out.println("Fiat " + comando);
	}

	@Override
	public void abrirTetoSolar(String comando) {
		//Não possui essa funcionalidade
		
	}

	@Override
	public void ligarArCondicionado(String comando) {
		//Não possui essa funcionalidade	
	}

	@Override
	public void ligarPilotoAutomatico(String comando) {
		//Não possui essa funcionalidade
	}

}
