package refatorado.acoes;

import refatorado.Carro;

public class Freiar {
	
	private boolean estado = false;
	private Carro carro;
	
	public Freiar(Carro carro) {
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
	

}
