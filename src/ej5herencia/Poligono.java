package ej5herencia;

public abstract class Poligono {
	/**
	 * Numero entero que contiene los numeros de lados
	 */
	protected int numeroLados;

	/**
	 * Constructor con parametros
	 * 
	 * @param numeroLados Numero entero que representa el numero de lados que tiene
	 *                    la figura
	 */
	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}
	
	/**
	 * Get que muestra el numero de lados
	 * @return Numero entero
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * Funcion abstracta que se utilizara para calcular el area
	 * @return
	 */
	public abstract double area();

	/**
	 * Funcion que imprime un array de una manera concreta
	 */
	@Override
	public String toString() {
		String cad = "";
		cad += "Numero de lados: " + numeroLados + "\n";
		return cad;
	}

}
