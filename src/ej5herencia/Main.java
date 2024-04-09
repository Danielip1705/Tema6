package ej5herencia;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Poligono[] lista = new Poligono[10];

	public static void main(String[] args) {
		int numeroLados = 0;
		int ops;
		double lado1;
		double lado2;
		double lado3;

		do {

			ops = menu();

			switch (ops) {
			case 1:
				System.out.println("Inserte el 1º lado");
				lado1 = sc.nextDouble();
				System.out.println("Inserte el 2º lado");
				lado2 = sc.nextDouble();
				System.out.println("Inserte la base");
				lado3 = sc.nextDouble();
				Triangulo tri = new Triangulo(3, lado1, lado2, lado3);
				añadirArray(tri);
				break;
			case 2:
				System.out.println("Inserte el 1º lado");
				lado1 = sc.nextDouble();
				System.out.println("Inserte el 2º lado");
				lado2 = sc.nextDouble();
				Rectangulo rec = new Rectangulo(2, lado1, lado2);
				añadirArray(rec);
				break;
			case 3:
				imprimirArray();
				break;
			default:
				System.out.println("Esta opcion no existe");
			}
		} while (ops != 0);
		
		sc.close();

	}

	public static int menu() {
		int ops;
		System.out.println("Eliga una opcion");
		System.out.println("1. Introducir Triángulo");
		System.out.println("2. Introducir Rectángulo");
		System.out.println("3. Mostrar contenido del array");
		ops = sc.nextInt();
		return ops;
	}

	public static void añadirArray(Poligono pol) {
		int i = 0;
		while (i < lista.length && lista[i] != null) {
			i++;
		}

		if (i < lista.length) {
			lista[i] = pol;
		}
	}

	public static void imprimirArray() {
		for (Poligono valor : lista) {
			if (valor != null) {
				System.out.println(valor);
			}
		}
	}

}
