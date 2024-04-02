package ej2herencia;

public class Operario extends Empleado {

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre Cadena que contiene un nombre
	 */
	public Operario(String nombre) {
		super(nombre);
	}

	/**
	 * Funcion de la clase padre modificado para imprimir el objeto
	 */
	@Override
	public String toString() {
		String cad = "";
		cad += super.toString() + " → Operario ";
		return cad;
	}
}
