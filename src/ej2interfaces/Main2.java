package ej2interfaces;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		
		//Creamos array de furbolistas con longitud 5
		 Futbolista[] fut = new Futbolista[5];
		 //Añadimos a los indices del 0 aal 4 jugadores
	        fut[0] = new Futbolista(1, "Raul", 29, 102);
	        fut[1] = new Futbolista(42, "Daniel", 18, 0);
	        fut[2] = new Futbolista(1, "Lauriel", 31, 209);
	        fut[3] = new Futbolista(39, "Mercedes", 26, 2);
	        fut[4] = new Futbolista(2, "Pablo", 45, 30);

	        //Ordenamos el array
	        Arrays.sort(fut);
	        
	        //Creamos bucle for each para recorrer los valores del array
	        for (Futbolista futbolista : fut) {
	        	//Imprimimos cada futbolista por consola
	            System.out.println(futbolista);
	        }
	}

}
