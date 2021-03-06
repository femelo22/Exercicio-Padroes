package original;

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

	public void acelerar(Integer qtdAcelerada) {
		if(this.marcaCarro.equalsIgnoreCase("BMW")) {
			Bmw bmw = new Bmw();
			bmw.acelerar(qtdAcelerada * 10);
		}else {
			if(this.marcaCarro.equalsIgnoreCase("Fiat")) {
				Fiat fiat = new Fiat();
				fiat.acelerar(qtdAcelerada * 3);
			}
		}
	}
	
	public void freiar() {
		if(this.marcaCarro.equalsIgnoreCase("BMW")) {
			Bmw bmw = new Bmw();
			bmw.freiar(comando);
		}else {
			if(this.marcaCarro.equalsIgnoreCase("Fiat")) {
				Fiat fiat = new Fiat();
				fiat.acelerar(30);
			}
		}
	}
	
	public void ligar() {
		if(this.marcaCarro.equalsIgnoreCase("BMW")) {
			Bmw bmw = new Bmw();
			bmw.acelerar(50);
		}else {
			if(this.marcaCarro.equalsIgnoreCase("Fiat")) {
				Fiat fiat = new Fiat();
				fiat.acelerar(30);
			}
		}
	}
	
	public void desligar() {
		if(this.marcaCarro.equalsIgnoreCase("BMW")) {
			Bmw bmw = new Bmw();
			bmw.acelerar(50);
		}else {
			if(this.marcaCarro.equalsIgnoreCase("Fiat")) {
				Fiat fiat = new Fiat();
				fiat.acelerar(30);
			}
		}
	}

	
	

}
