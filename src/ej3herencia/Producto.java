package ej3herencia;

public class Producto {

	/**
	 * Cadena que contiene el nombre del producto
	 */
	protected String nombre;

	/**
	 * Numero decimal que contiene el precio del producto
	 */
	protected double precio;

	/**
	 * Constructor sin parametros
	 */
	public Producto() {

	}

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre Cadena que contiene el nombre del producto
	 * @param precio Numero entero que contiene el precio del producto
	 */
	public Producto(String nombre, double precio) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (precio >= 0) {
			this.precio = precio;

		}
	}

	/**
	 * Get que muestra el nombre del producto
	 * 
	 * @return Cadena con el nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Set que modifica el atributo nombre
	 * 
	 * @param nombre Cadena que contiene nombre a modificar
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Get que muestra el precio del producto
	 * 
	 * @return Numero decimal que contiene el precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Set que modifica el Atributo precio
	 * 
	 * @param precio Numero decimal que contiene el precio a modificar
	 */
	public void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		}
	}

	/**
	 * Funcion que calcula el precio total segun la cantidad de productos que hay
	 * 
	 * @param cantidad Numero entero que contiene la cantidad de productos que hay
	 * @return Numero decimal que contiene el precio total del producto
	 */
	public double calcular(int cantidad) {

		return precio *= cantidad;
	}

	/**
	 * Funcion que imprime el objeto de un modo concreto
	 */
	@Override
	public String toString() {
		String cad = "";
		cad += "Nombre: " + nombre + "\n";
		cad += "Precio: " + precio + "\n";
		return cad;
	}

}
