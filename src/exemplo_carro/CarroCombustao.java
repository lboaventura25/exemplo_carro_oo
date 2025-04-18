package exemplo_carro;

public class CarroCombustao extends CarroGenerico {
	private int capacidadeTanque;

	public CarroCombustao(String fabricante, String modelo) {
		super(fabricante, modelo);
		this.capacidadeTanque = 0;
	}
	
	public void acelerar() {
		System.out.println("Carro acelerando...");
	}
	
	public void frear() {
		System.out.println("Carro freando...");
	}
	
	public void abastecer() {
		System.out.println("Carro abastecendo...");
	}
}
