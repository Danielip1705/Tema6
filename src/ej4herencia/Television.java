package ej4herencia;

import ej4herencia.Electrodomestico.Colores;
import ej4herencia.Electrodomestico.ConsumoEnergetico;

public class Television extends Electrodomestico {

	private int resolucion = 20;
	private boolean sintonizador = false;

	public Television() {

	}

	public Television(double precio, int peso) {
		super(precio, peso);
	}

	public Television(double precio, String color, char conE, int peso, int resolucion,
			boolean sintonizador) {
		super(precio, color, conE, peso);
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		this.sintonizador = sintonizador;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		
		if(resolucion>40) {
			super.precioBase*=1.30;
		}
		if(sintonizador) {
			super.precioBase+=50;
		}
	}
}
