package ej4herencia;

public class Electrodomestico {

	/**
	 * Lista de enumerados de consumo energetico
	 */
	enum ConsumoEnergetico {
		A, B, C, D, E, F
	};

	/**
	 * Lista de enumerados de colores
	 */
	enum Colores {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	};

	/**
	 * Numero decimal que contiene el precio base
	 */
	protected double precioBase = 100;

	protected ConsumoEnergetico conEnerg = ConsumoEnergetico.F;

	protected Colores color = Colores.BLANCO;
	/**
	 * Numero entero que indica el peso
	 */
	protected int peso = 5;

	/**
	 * Constructor sin parametros
	 */
	public Electrodomestico() {

	}

	/**
	 * Constructor con algunos parametros
	 * 
	 * @param precioBase Numero decimal que contiene el precio
	 * @param peso       Numero entero que contiene el peso
	 */
	public Electrodomestico(double precioBase, int peso) {
		if (precioBase >= 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;

		}
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precioBase       Numero decimal que contiene el precio
	 * @param color            Cadena que contiene el color
	 * @param consumoElectrico Caracter que conteine el consumo electronico
	 * @param peso             Numero entero que contiene el peso
	 */
	public Electrodomestico(double precioBase, String color, char conE, int peso) {
		this(precioBase, peso);
		comprobarConsumoEnergetico(conE);
		comprobarColor(color);
	}

	/**
	 * Get que muestra el precio base
	 * 
	 * @return Numero decimal
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * Get que muestra un valor de la lista del enumerado pasado como cadena
	 * 
	 * @return Cadena
	 */
	public char getConEnerg() {
		return String.valueOf(this.conEnerg).charAt(0);
	}

	/**
	 * Get que muestra un valor de la lista del enumerado pasado como cadena
	 * 
	 * @return Cadena
	 */
	public String getColor() {
		return String.valueOf(this.color);
	}

	/**
	 * Get que muestra el peso
	 * 
	 * @return Numero entero
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * Funcion que comprueba si el carater del consumoEnergetico es igual al de la
	 * lista del enumerado
	 * 
	 * @param letra Caracter que contiene el consumo energetico del electrodomestico
	 */
	private void comprobarConsumoEnergetico(char letra) {

		switch (letra) {
		case 'A', 'B', 'C', 'D', 'E', 'F':
			this.conEnerg = ConsumoEnergetico.valueOf(String.valueOf(letra));
			break;
		default:
			break;
		}
	}

	/**
	 * Funcion que compara una cadena pasada por el usuario con la lista del
	 * enumerado colores
	 * 
	 * @param color Cadena que contiene el color del electrodomestico
	 */
	private void comprobarColor(String color) {
		String colorMayus = color.toUpperCase();

		switch (colorMayus) {
		case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS":
			this.color = Colores.valueOf(colorMayus);
			break;
		default:
			break;
		}
	}

	/**
	 * Funcion que aumenta el precio segun el contenido del peso y del consumo
	 * energetico
	 */
	public void precioFinal() {

		switch (conEnerg) {
		case A:
			precioBase += 100;
			break;
		case B:
			precioBase += 80;
			break;
		case C:
			precioBase += 60;
			break;
		case D:
			precioBase += 50;
			break;
		case E:
			precioBase += 30;
			break;
		case F:
			precioBase += 10;
		}
		if (peso >= 0 && peso <= 19) {
			precioBase += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioBase += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioBase += 80;
		} else if (peso > 80) {
			precioBase += 100;
		}
	}

	/**
	 * Funcion que imprime el objeto de esta clase de una forma concreta
	 */
	@Override
	public String toString() {
		String cad = "";
		cad += "Precio: " + this.precioBase + "\n";
		cad += "Consumo Energetico: " + this.conEnerg + "\n";
		cad += "Color: " + this.color + "\n";
		cad += "Peso: " + this.peso + "\n";
		return cad;
	}

}
