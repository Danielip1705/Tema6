package ej3interfaces;

public class AnimalDomestico implements Animal {

	/**
	 * Cadena que contiene el nombre del animal
	 */
	protected String nombre = "";
	/**
	 * Cadena que contiene la raza
	 */
	protected String raza = "";
	/**
	 * Numero decimal que contiene el peso
	 */
	protected double peso;
	/**
	 * Cadena que contiene el color
	 */
	protected String color = "";

	/**
	 * constsructor con parametros
	 * 
	 * @param nombre Cadena que contiene un nombre
	 * @param raza   Cadena que contiene una raza
	 * @param peso   Numero decimal que contiene el peso
	 * @param color  Cadena que contiene un color
	 */
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (raza != null && !raza.equals("")) {
			this.raza = raza;
		}
		if (peso > 0) {
			this.peso = peso;
		}
		if (color != null && !color.equals("")) {
			this.color = color;
		}

	}

	/**
	 * Funcion que indica la vacuna
	 */
	void vacunar() {

	}

	/**
	 * Funcion que indica quien haceCaso
	 * @return true por defecto
	 */
	boolean hacerCaso() {

		return true;
	}

	/**
	 * Funcion comer
	 */
	@Override
	public void comer() {

	}

	/**
	 * Funcion dormir
	 */
	@Override
	public void dormir() {

	}

	/**
	 * Funcion hacerRuido
	 */
	@Override
	public void hacerRuido() {
		// TODO Auto-generated method stub

	}

}
