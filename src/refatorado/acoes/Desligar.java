package refatorado.acoes;

import refatorado.Carro;

public class Desligar {
	private boolean estado = false;
	private Carro carro;
	
	public Desligar(Carro carro) {
		this.carro = carro;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	public void desligar() {
		this.carro.freiar();
	}
}
