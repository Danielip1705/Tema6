package ej2herencia;

public class Oficial extends Operario {

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre Cadena que contiene un nombre
	 */
	public Oficial(String nombre) {
		super(nombre);
	}

	/**
	 * Funcion de la clase padre modificado para imprimir el objeto
	 */
	@Override
	public String toString() {
		String cad = "";
		cad += super.toString() + " → Oficial";
		return cad;
	}

}
