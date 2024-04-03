package ej3herencia;

public class NoPerecedero extends Productos {

	/**
	 * Cadena que contiene el tipo del producto
	 */
	private String tipo;

	/**
	 * Constructor sin parametros
	 */
	public NoPerecedero() {

	}

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre Cadena que representa el nombre del producto
	 * @param precio Numero decimal que representa el precio del producto
	 * @param tipo   Numero entero que reprenta los dias a caducar
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	/**
	 * Get que muestra el tipo del producto
	 * 
	 * @return Cadena que contiene el tipo del producto
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Set que modifica el atributo tipo
	 * 
	 * @param tipo Cadena que contiene el tipo a modificar
	 */
	public void setTipo(String tipo) {
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	public double calcular(int cantidad) {

		super.calcular(cantidad);
		
		return super.precio;
	}
}
