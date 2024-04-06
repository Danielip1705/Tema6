package ej4herencia;

import ej4herencia.Electrodomestico.Colores;
import ej4herencia.Electrodomestico.ConsumoEnergetico;

public class Television extends Electrodomestico {

	/**
	 * Numero entero que contiene la resolucion del televisor
	 */
	private int resolucion = 20;

	/**
	 * Boleano que contiene valor true o false del sintonizador (si tiene o no)
	 */
	private boolean sintonizador = false;

	/**
	 * Constructor sin parametros
	 */
	public Television() {

	}

	/**
	 * Constructor con los parametros precio y peso
	 * 
	 * @param precio Numero decimal que contiene el precio de la lavadora
	 * @param peso   Numero entero que contiene le peso de la lavadora
	 */
	Television(double precio, int peso) {
		super(precio, peso);
	}

	/**
	 * 
	 * @param precio           Numero decimal que contiene el precio
	 * @param color            Cadena que contiene el color
	 * @param consumoElectrico Caracter que conteine el consumo electronico
	 * @param peso             Numero entero que contiene el peso
	 * @param resolucion       Numero entero que contiene la resolucion
	 * @param sintonizador     Booleano que contiene valor true o false (si tiene o
	 *                         no)
	 */
	public Television(double precio, String color, char conE, int peso, int resolucion, boolean sintonizador) {
		super(precio, color, conE, peso);
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		this.sintonizador = sintonizador;
	}

	/**
	 * Get que muestra la resolucion del televisor
	 * 
	 * @return Numero entero indicando el tamaño
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * Get que muestra si tiene o no sintonizador
	 * 
	 * @return Valor booleano true o false (si tiene o no sintonizador)
	 */
	public boolean getSintonizador() {
		return sintonizador;
	}

	/**
	 * Funcion que calcula el precio final del televisor dependiendo de la
	 * resolucion y si tiene o no sintonizador
	 */
	@Override
	public void precioFinal() {
		super.precioFinal();

		if (resolucion > 40) {
			super.precioBase *= 1.30;
		}
		if (sintonizador) {
			super.precioBase += 50;
		}

	}

	/**
	 * Funcion que imprime el objeto de esta clase de una forma concreta
	 */
	@Override
	public String toString() {
		String cad = super.toString();
		cad += "Resolucion: " + this.resolucion + "\n";
		if (sintonizador) {
			cad += "Sintonizador: No";
		} else {
			cad += "Sintonizador: Si";

		}
		return cad;
	}
}
