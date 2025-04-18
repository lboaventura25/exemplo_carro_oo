package exemplo_carro;

import java.util.ArrayList;

public class MeuPrograma {

	public static void main(String[] args) {
		int index = 0;
		CarroCombustao carro1 = new CarroCombustao("Volkswagen", "Kombi");
		ArrayList<CarroGenerico> carros = new ArrayList<>();
		
		carros.add(new CarroCombustao("Fiat", "Argo"));
		carros.add(carro1);
		carros.add(new CarroEletrico("BYD", "Dolphin"));
		
		for(index = 0; index < carros.size(); index++) {
			System.out.println("------------------------");
			carros.get(index);
			carros.get(index).imprimir();
		}
		
		for(CarroGenerico carro_atual: carros) {
			System.out.println("\n------------------------");
			if (carro_atual instanceof CarroCombustao) {
				((CarroCombustao) carro_atual).abastecer();
			} else if (carro_atual instanceof CarroEletrico) {
				((CarroEletrico) carro_atual).carregar();
			}
			
			carro_atual.imprimir();
		}
	}

}
