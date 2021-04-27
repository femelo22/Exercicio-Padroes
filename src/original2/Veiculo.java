package original2;

public class Veiculo {
	
	private String comando;
	private String marcaCarro;
	
	public Veiculo(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}

	public String getComando() {
		return comando;
	}

	public void setComando(String comando) {
		this.comando = comando;
	}

	public String getMarcaCarro() {
		return marcaCarro;
	}

	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}

	public void acelerar() {
		if(this.marcaCarro.equalsIgnoreCase("BMW")) {
			Bmw bmw = new Bmw();
			bmw.acelerar(this.comando);
		}else {
			if(this.marcaCarro.equalsIgnoreCase("Fiat")) {
				Fiat fiat = new Fiat();
				fiat.acelerar(comando);
			}
		}
	}
	
	public void freiar() {
		if(this.marcaCarro.equalsIgnoreCase("BMW")) {
			Bmw bmw = new Bmw();
			bmw.acelerar(this.comando);
		}else {
			if(this.marcaCarro.equalsIgnoreCase("Fiat")) {
				Fiat fiat = new Fiat();
				fiat.acelerar(comando);
			}
		}
	}
	
	public void ligar() {
		if(this.marcaCarro.equalsIgnoreCase("BMW")) {
			Bmw bmw = new Bmw();
			bmw.acelerar(this.comando);
		}else {
			if(this.marcaCarro.equalsIgnoreCase("Fiat")) {
				Fiat fiat = new Fiat();
				fiat.acelerar(comando);
			}
		}
	}
	
	public void desligar() {
		if(this.marcaCarro.equalsIgnoreCase("BMW")) {
			Bmw bmw = new Bmw();
			bmw.acelerar(this.comando);
		}else {
			if(this.marcaCarro.equalsIgnoreCase("Fiat")) {
				Fiat fiat = new Fiat();
				fiat.acelerar(comando);
			}
		}
	}
}
