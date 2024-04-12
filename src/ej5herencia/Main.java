package ej5herencia;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Poligono[] lista = new Poligono[10];

	public static void main(String[] args) {
		// Numero entero donde se almacenara la opcion ha elegir
		int ops;
		// Numero decimal que contiene la medida del 1º lado
		double lado1;
		// Numero decimal que contiene la medida del 2º lado
		double lado2;
		// Numero decimal que contiene la medida del 3º lado
		double lado3;

		// Creamos bucle do while
		do {
			// inicializamos ops con el resultado de la funcion menu
			ops = menu();

			// Declaramos switch teniendo en cuenta ops
			switch (ops) {
			// caso1
			case 1:
				// Pedimos y escribimos el 1º lado
				System.out.println("Inserte el 1º lado");
				lado1 = sc.nextDouble();
				// Pedidmos y escribimos el 2º lado
				System.out.println("Inserte el 2º lado");
				lado2 = sc.nextDouble();
				// Pedimos y escribimos la base (3º lado)
				System.out.println("Inserte la base");
				lado3 = sc.nextDouble();
				// Creamos objeto triangulo y lo inicializamos
				Triangulo tri = new Triangulo(lado1, lado2, lado3);
				// añadimos el objeto en la funcion añadirArray
				ArrayPoligono.añadirArray(tri);
				// Rompemos caso 1
				break;
			// case 2
			case 2:
				// Pedimos y escribimos el lado 1
				System.out.println("Inserte el 1º lado");
				lado1 = sc.nextDouble();
				// Pedimos y escribimos el lado 2
				System.out.println("Inserte el 2º lado");
				lado2 = sc.nextDouble();
				// Creamos objeto rectangulo y lo inicializamos
				Rectangulo rec = new Rectangulo(lado1, lado2);
				// Llamamos la funcion añadirArray con el objeto
				ArrayPoligono.añadirArray(rec);
				// Rompemos caso 2
				break;
			case 3:
				// Llamamos la funcion imprimirArray
				ArrayPoligono.imprimirArray();
				// Rompemos caso 3
				break;
			// Y si no es ninguno de los caso anteriores
			default:
				// Imprimimos que la opcion no existe
				System.out.println("Esta opcion no existe");
			}
			// Rompemos bucle si ops es 0
		} while (ops != 0);

		// Cerramos scanner
		sc.close();

	}

	/**
	 * Funcion menu que imprime el menu y la opcion de elegir
	 * 
	 * @return Numero entero que contiene la opcion a elegir
	 */
	public static int menu() {
		int ops;
		System.out.println("Eliga una opcion");
		System.out.println("1. Introducir Triángulo");
		System.out.println("2. Introducir Rectángulo");
		System.out.println("3. Mostrar contenido del array");
		ops = sc.nextInt();
		return ops;
	}

	

}
