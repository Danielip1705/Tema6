package ej1interfaces;

public class Socio implements Comparable<Socio> {
	/**
	 * Numero entero que indica la id del socio
	 */
	private int id;
	/**
	 * Cadena que indica el nombre del socio
	 */
	private String nombre;
	/**
	 * Numero entero que indica la edad del socio
	 */
	private int edad;

	/**
	 * Constructor con parametros
	 * 
	 * @param id     Numero entero que contiene la id del socio
	 * @param nombre Cadena que contiene el nombre del socio
	 * @param edad   Numero entero que contiene la edad del socio
	 */
	public Socio(int id, String nombre, int edad) {
		if (id > 0) {
			this.id = id;
		}
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * Funcion que imprime el objeto de una manera concreta
	 */
	@Override
	public String toString() {
		String cad = "";
		cad += "ID: " + id + "\n";
		cad += "Nombre: " + nombre + "\n";
		cad += "Edad: " + edad;
		return cad;
	}

	/**
	 * Funcion que compara la id del objeto con el atributo
	 */
	@Override
	public int compareTo(Socio o) {
		int res = 0;
		if (this.id < o.id) {
			res = -1;
		} else if (this.id > o.id) {
			res = 1;
		}
		return res;
	}
}
