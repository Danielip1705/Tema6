package ej5herencia;

public class Triangulo extends Poligono {
	/**
	 * Numero decimal que contiene el 1º lado
	 */
	private double lado1;
	/**
	 * Numero decimal que contiene el 2º lado
	 */
	private double lado2;
	/**
	 * Numero decimal que contiene el 3º lado
	 */
	private double lado3;

	/**
	 * Constructor con parametros del padre
	 * 
	 * @param numeroLados Numero entero que contiene el numero de lados
	 */
	public Triangulo(int numeroLados) {
		super(numeroLados);
	}

	/**
	 * Constructor con todos los parametros
	 */
	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
		super(numeroLados);
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	/**
	 * Funcion que calcula el area del triangulo con la formula heron
	 */
	@Override
	public double area() {

		double s = (lado1 + lado2 + lado3) / 2;
		return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
	}

	/**
	 * Funcion que imprime el objeto de la clase de una forma concreta
	 */
	@Override
	public String toString() {
		String cad = super.toString();
		cad += "Lado 1: " + lado1 + "\n";
		cad += "Lado 2: " + lado2 + "\n";
		cad += "Base: " + lado3 + "\n";
		cad += "Area: " + area() + "\n";

		return cad;
	}

}
