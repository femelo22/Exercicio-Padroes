package refatorado;

public class Main {

	public static void main(String[] args) {

		Veiculo bmw = new Veiculo(new Bmw());
		bmw.ligar();
		bmw.acelerar();		
		
	}
}
