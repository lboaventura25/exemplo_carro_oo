package exemplo_carro;

public class CarroEletrico extends CarroGenerico {
	private int capacidadeBateria;
	
	public CarroEletrico(String fabricante, String modelo) {
		super(fabricante, modelo);
		this.capacidadeBateria = 0;
	}
	
	public void acelerar() {
		System.out.println("Carro acelerando...");
	}
	
	public void frear() {
		System.out.println("Carro freando...");
	}
	
	public void carregar() {
		System.out.println("Carro carregando...");
	}
}
