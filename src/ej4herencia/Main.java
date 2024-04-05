package ej4herencia;

import ej4herencia.Electrodomestico.Colores;
import ej4herencia.Electrodomestico.ConsumoEnergetico;

public class Main {

	public static void main(String[] args) {
		int sumaPrecio=0;
		
		Electrodomestico[] lista = new Electrodomestico[10];
		//double precioBase, String color, char conE, int peso
		lista = new Electrodomestico(140,"Blanco",'C',130);
		
		for(Electrodomestico elect : lista) {
			
			elect.precioFinal();
			
		}
		
		for(Electrodomestico elect: lista) {
			if(elect instanceof Lavadora) {
				
			} else if(elect instanceof Television) {
				
			}
		}
	}

}
