package ej4herencia;

public class Main {

	public static void main(String[] args) {
		// Creamos con la variable int suma precio, que contendra la suma total de todos
		// los electrodomesticos
		int sumaPrecio = 0;
		// Creamos con la variable int suma Lavadora, que contendra la suma total de
		// todas las lavadoras
		int sumaLavadoras = 0;
		// Creamos con la variable int suma televisores, que contendra la suma total de
		// todos los televisores
		int sumaTelevisiones = 0;

		// Creamos con la clase Electrodomesticos un array de longitud 10
		Electrodomestico[] lista = new Electrodomestico[10];

		// En la 1 posicion (indice 0) creamos un objeto clase Electrodomestico con
		// todos los parametros
		lista[0] = new Electrodomestico(140, "Blanco", 'C', 130);
		// En la 2 posicion (indice 1) creamos un objeto clase Lavadora con todos los
		// parametros
		lista[1] = new Lavadora(140, "Negro", 'B', 70, 30);
		// En la 3 posicion (indice 2) creamos un objeto clase Television con todos los
		// parametros
		lista[2] = new Television(430, "Rojo", 'D', 15, 42, true);

		// Cremaos bucle for each donde itenara cada valor del array
		for (Electrodomestico elect : lista) {

			// Si el valor no es nulo realizara lo siguiente
			if (elect != null) {

				// Valor llamara a la funcion precioFinal para calcular el precio
				elect.precioFinal();

				precioBase(elect);
				
				// Guardamos la suma de todos los precios en la variable sumaPrecio
				sumaPrecio += elect.getPrecioBase();

				// Declaramos con la variable if que si valor proviene de la clase Lavadora
				if (elect instanceof Lavadora) {

					// Guardamos la suma de las lavadoras
					sumaLavadoras += elect.getPrecioBase();
					// Y si no, declaramos con else if que si el valir proviene de la clase
					// Television
				} else if (elect instanceof Television) {
					// Gurdamos la suma total de todoas las televisiones
					sumaTelevisiones += elect.getPrecioBase();
				}
				// Imprimos una separacion
				System.out.println("----------------------------------------------------------");
			}

		}
		// Imprimimos el precio calculado total de los electrodomesticos, lavadoras y
		// televisores
		System.out.println("Precio total de electrodomesticos: " + sumaPrecio);
		System.out.println("Precio total de Lavadoras: " + sumaLavadoras);
		System.out.println("Precio total de Televisiones: " + sumaTelevisiones);
	}

	/**
	 * Funcion que imprime el precio base de las clase electrodomestico y de sus
	 * clases heredadas
	 * 
	 * @param elect Objeto de la clase padre o de las heredadas
	 */
	private static void precioBase(Electrodomestico elect) {
		// Declaramos con la variable id que si valor proviene de la clase Lavadora
		if (elect instanceof Lavadora) {
			// Imprimimos precio base de la lavadora
			System.out.println("Precio base Lavadora: " + elect.getPrecioBase());

			// Y si no, declaramos con else if que si el valir proviene de la clase
			// Television
		} else if (elect instanceof Television) {
			// Que imprime el precio base de television
			System.out.println("Precio base Television: " + elect.getPrecioBase());
		} else if (elect instanceof Electrodomestico) {
			// Imprimimos precio base del electrodomestico
			System.out.println("Precio base Electrodomestico: " + elect.getPrecioBase());
		}
	}

}
