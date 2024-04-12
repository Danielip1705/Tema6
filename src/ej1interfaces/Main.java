package ej1interfaces;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//Creamos con la variable int resultado
		int resultado;
		//Creamos objeto socio 1 que contiene datos
		Socio socio1 = new Socio(31, "Daniel", 18);
		
		//Creamos objeto socio 2 que contiene datos
		Socio socio2 = new Socio(5, "Pablo", 25);
		
		//Creamos objeto socio 3 que contiene datos
		Socio socio3 = new Socio(124, "Evelyn", 19);
		
		//Creamos array de socios y le añadimos los objetos creados anteriormente
		Socio[] socios = { socio1, socio2, socio3 };
		
		//Inicializamos resultado con el resultado de la funcion compareTo (Comparamos la id mas antigua,la que se acerque mas a 0)
		resultado = socio1.compareTo(socio2);
		
		//Declaramos con if que si el resultado es 1, imprimimos que socio 1 es mas joven
		if(resultado ==1) {
			System.out.println("Socio 1 es mas joven que socio 2");
			//y si no, imprimimos que socio 2 es mas joven
		} else {
			System.out.println("Socio 2 es mas joven que socio 1");
		}
		

		//Inicializamos de nuevo resultado con el resultado de la funcion compareTo
		resultado = socio2.compareTo(socio3);
		
		//Declaramos con if que si el resultado es 1, imprimimos que socio 2 es mas joven
		if(resultado ==1) {
			System.out.println("Socio 2 es mas joven que socio 3");
			
			//y si no, imprimimos que socio 3 es mas joven
		} else {
			System.out.println("Socio 3 es mas joven que socio 2");
			
		}
		//Ordenamos el array de socios
		Arrays.sort(socios);
		
		System.out.println("Socios ordenados por ID:");
		
		//Creamos bucle for each para recorrer el array de socios y imprimirlos
		for (Socio socio : socios) {
			
			System.out.println(socio);
		}
	}

}
