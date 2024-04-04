package ej3herencia;

public class Perecedero extends Producto {

	/**
	 * Numero entero que representa los dias a caducar
	 */
	private int diasACaducar;

	/**
	 * Constructor sin parametros
	 */
	public Perecedero() {
		super();
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre  Cadena que representa el nombre del producto
	 * @param precio  Numero decimal que representa el precio del producto
	 * @param caducar Numero entero que reprenta los dias a caducar
	 */
	public Perecedero(String nombre, double precio, int caducar) {
		super(nombre, precio);
		if (caducar > 0) {
			this.diasACaducar = caducar;
		}
	}

	/**
	 * Get que muestra los dias a caducar
	 * 
	 * @return Numero entero que contiene los dias a caducar
	 */
	public int getDiasACaducar() {
		return diasACaducar;
	}

	/**
	 * Set que modifica el atributo diasACadudar
	 * 
	 * @param diasACaducar Numero entero que contiene los dias a caducar
	 */
	public void setDiasACaducar(int diasACaducar) {
		if (diasACaducar >= 0) {
			this.diasACaducar = diasACaducar;
		}
	}

	@Override
	/**
	 * Funcion que descuenta el precio del producto segun cuantos dias le falta para
	 * que caduque
	 * 
	 * @param
	 */
	public double calcular(int cantidad) {

		switch (diasACaducar) {
		case 1:
			super.precio /= 4;
			break;
		case 2:
			super.precio /= 3;
			break;
		case 3:
			super.precio /= 2;
		}

		return super.precio;
	}

	/**
	 * Funcion que imprime el objeto de una manera concreta
	 */
	@Override
	public String toString() {
		String cad = super.toString();
		cad += "Dias a caducar: " + diasACaducar + "\n";
		return cad;
	}

}
