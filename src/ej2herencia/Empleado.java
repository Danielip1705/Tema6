package ej2herencia;

public class Empleado {
	/**
	 * Cadena privada que contendra un nombre
	 */
	private String nombre;

	/**
	 * Constructor sin parametros
	 */
	public Empleado() {
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre Cadena que contiene un nombre
	 */
	public Empleado(String nombre) {

		if (nombre != null && !nombre.equals("")) {

			this.nombre = nombre;
		}
	}

	/**
	 * Get que muestra el nombre del empleado
	 * 
	 * @return Cadena que contiene el nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Set que cambia el nombre del empleado
	 * 
	 * @param nombre Cadena con el nombre del empleado a cambiar
	 */
	public void setNombre(String nombre) {

		if (nombre != null && !nombre.equals("")) {

			this.nombre = nombre;
		}
	}

	/**
	 * Funcion que imprime el objeto
	 */
	@Override
	public String toString() {
		String cad = "";
		cad += "Empleado " + nombre;
		return cad;
	}

}
