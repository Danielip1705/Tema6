package ej5herencia;

public class Rectangulo extends Poligono {

	/**
	 * Numero decimal que contiene el 1º lado
	 */
	private double lado1;
	/**
	 * Numero decimal que contiene el 2º lado
	 */
	private double lado2;
	
	/**
	 * Constructor con parametros del padre
	 * @param numeroLados Numero entero que contiene el numero de lados de la figura
	 */
	public Rectangulo (int numeroLados) {
		super(numeroLados);
	}

	/**
	 * Constructor con parametros
	 * @param numeroLados Numero entero que contiene el numero de lados de la figura
	 * @param lado1 Numero decimal que contiene la medida del 1º lado
	 * @param lado2 Numero decimal que contiene la medidaa del 2º lado
	 */
	public Rectangulo(int numeroLados, double lado1, double lado2) {
		super(numeroLados);
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	/**
	 * Get que muestra el 1º lado
	 * @return Numero decimal que contiene el 1º lado
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Set que modifica el 1º lado
	 * @param lado1 Lado 1 modificado
	 */
	public void setLado1(double lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}
	/**
	 * Get que muestra el 2º lado
	 * @return
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Set que modifica el 2 lado
	 * @param lado2 Numero decimal que contiene el lado a modificar
	 */
	public void setLado2(double lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	/**
	 * Funcion que calcula el area del rectangulo
	 */
	@Override
	public double area() {

		return (lado1 * lado2) / 2;
	}

	/**
	 * Funcion que imprime el objeto de la clase de una forma concreta
	 */
	@Override
	public String toString() {
		String cad =super.toString();
		cad+="Largo: " + lado1+"\n";
		cad+="Ancho: " + lado2+"\n";
		cad+="Area: " + area();
		return cad;
	}
	
	

}
