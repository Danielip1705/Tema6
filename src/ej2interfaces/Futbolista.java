package ej2interfaces;

public class Futbolista implements Comparable<Futbolista> {
	/**
	 * Numero entero que indica el numero de la camisa del futbolista
	 */
	private int numCamisa;

	/**
	 * Cadena que contiene el nombre del futbolista
	 */
	private String nombre;

	/**
	 * Numero entero que contiene la edad del futbolista
	 */
	private int edad;

	/**
	 * Numero entero que contiene el numero de goles que ha marcado el futbolista
	 */
	private int numGoles;

	/**
	 * Constructor con parametros
	 * 
	 * @param numCamisa Numero entero que reprenta el numero de camisa
	 * @param nombre    Cadena que representa el nombre
	 * @param edad      Numero entero que representa la edad
	 * @param numGoles  Numero entero que representa el numero de goles
	 */
	public Futbolista(int numCamisa, String nombre, int edad, int numGoles) {
		if (numCamisa >= 0 && numCamisa <= 99) {
			this.numCamisa = numCamisa;
		}
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (edad >= 8 && edad <= 55) {
			this.edad = edad;
		}
		if (numGoles >= 0) {
			this.numGoles = numGoles;
		}
	}

	/**
	 * Funcion que compara si hay jugadores con el mismo numero de camisa y mismo
	 * nombre
	 */
	@Override
	public boolean equals(Object obj) {
		boolean igual = false;
		Futbolista fut = (Futbolista) obj;
		if (this.numCamisa == fut.numCamisa && 
				this.nombre.equals(fut.nombre)) {
			igual = true;
		}
		return igual;
	}

	/**
	 * Funcion que imprime el objeto de una manera concreta
	 */
	@Override
	public String toString() {
		String cad = "";
		cad += "Numero de camisa: " + this.numCamisa + "\n";
		cad += "Nombre: " + this.nombre + "\n";
		cad += "Edad: " + this.edad + "\n";
		cad += "Numero de goles " + this.numGoles + "\n";
		return cad;
	}

	/**
	 * Funcion que compara las camisas de los jugadores
	 */
	@Override
	public int compareTo(Futbolista o) {
		int res = 0;
		if (this.numCamisa < o.numCamisa) {
			res = -1;
		} else if (this.numCamisa > o.numCamisa) {
			res = 1;
		} else {
			res = this.nombre.compareTo(o.nombre);
		}
		return res;
	}

}
