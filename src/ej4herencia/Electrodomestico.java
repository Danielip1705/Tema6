package ej4herencia;

public class Electrodomestico {

	enum ConsumoEnergetico {
		A, B, C, D, E, F
	};

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

	public double getPrecioBase() {
		return precioBase;
	}

	public char getConEnerg() {
		return String.valueOf(this.conEnerg).charAt(0);
	}

	public String getColor() {
		return String.valueOf(this.color);
	}

	public int getPeso() {
		return peso;
	}

	private void comprobarConsumoEnergetico(char letra) {

		switch (letra) {
		case 'A', 'B', 'C', 'D', 'E', 'F':
			this.conEnerg = ConsumoEnergetico.valueOf(String.valueOf(letra));
			break;
		default:
			break;
		}
	}

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

}
