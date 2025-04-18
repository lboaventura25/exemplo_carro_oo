package exemplo_carro;

public abstract class CarroGenerico {
	private String fabricante;
	private String modelo;
	private int ano;
	private int potencia;
	private int velocidade;
	
	public CarroGenerico(String fabricante, String modelo) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = 0;
		this.potencia = 0;
		this.velocidade = 0;
	}
	
	public String getFabricante() {
		return this.fabricante;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void imprimir() {
		System.out.println("Fabricante: " + this.getFabricante());
		System.out.println("Modelo: " + this.getModelo());
	}
	
	public abstract void reabastecer() {
		System.out.println("reabastecendo...");
	}
}
