package ej4herencia;

public class Electrodomestico {

	enum consumoEnergetico {
		A, B, C, D, F
	}

	enum colores {
		blanco, negro, rojo, azul, gris
	}

	/**
	 * Numero decimal que contiene el precio base
	 */
	protected double precioBase = 100;

	protected consumoEnergetico conEnerg = consumoEnergetico.F;

	protected colores color = colores.blanco;
	/**
	 * Numero entero que indica el peso
	 */
	protected int peso = 5;

	/**
	 * Constructor sin parametros
	 */
	public Electrodomestico() {

	}

	/**
	 * Constructor con algunos parametros
	 * 
	 * @param precioBase Numero decimal que contiene el precio
	 * @param peso       Numero entero que contiene el peso
	 */
	public Electrodomestico(double precioBase, int peso) {
		if (precioBase >= 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;

		}
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precioBase       Numero decimal que contiene el precio
	 * @param color            Cadena que contiene el color
	 * @param consumoElectrico Caracter que conteine el consumo electronico
	 * @param peso             Numero entero que contiene el peso
	 */
	public Electrodomestico(double precioBase, String color, char conE, int peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (color != null && !color.equals("")) {
			this.color = colores.valueOf(color);
		}
		if (conE != null) {
			this.conEnerg = conEnerg.valueOf(conE);
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

}
