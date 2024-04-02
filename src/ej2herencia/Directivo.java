package ej2herencia;

public class Directivo extends Empleado {

	/**
	 * Constructor con parametros de la clase padre
	 * 
	 * @param nombre Cadena que contiene un nombre
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	/**
	 * Funcion de la clase padre modificado para imprimir el objeto
	 */
	@Override
	public String toString() {
		String cad = "";
		cad += super.toString() + " → Directivo";
		return cad;
	}
}
