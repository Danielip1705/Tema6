package ej4herencia;

public class Lavadora extends Electrodomestico {

	/**
	 * Numero entero que contiene el peso de carga
	 */
	private int carga = 5;

	/**
	 * Constructor sin parametros
	 */
	public Lavadora() {

	}

	/**
	 * Constructor con los parametros precio y peso
	 * 
	 * @param precio Numero decimal que contiene el precio de la lavadora
	 * @param peso   Numero entero que contiene le peso de la lavadora
	 */
	public Lavadora(double precio, int peso) {
		super(precio, peso);
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precio           Numero decimal que contiene el precio
	 * @param color            Cadena que contiene el color
	 * @param consumoElectrico Caracter que conteine el consumo electronico
	 * @param peso             Numero entero que contiene el peso
	 * @param carga            Numero entero que contiene el peso de carga
	 */
	public Lavadora(double precio, String color, char conE, int peso, int carga) {
		super(precio, color, conE, peso);

		if (carga >= 0) {
			this.carga = carga;
		}
	}

	/**
	 * Get que muestra la carga de la lavadora
	 * 
	 * @return Numero entero
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * Funcio que calcula el precio de la lavadora segun la carga de esta
	 */
	@Override
	public void precioFinal() {
		super.precioFinal();

		if (carga > 30) {
			super.precioBase += 30;
		}
	}

	/**
	 * Funcion que imprime el objeto de esta clase de una manera concreta
	 */
	@Override
	public String toString() {
		String cad = super.toString();
		cad += "Carga: " + this.carga;
		return cad;
	}

}
