package ej5herencia;

public class ArrayPoligono {
	static Poligono[] lista = new Poligono[10];

	/**
	 * Funcion que añade un objeto al array
	 * 
	 * @param pol Objeto de la clase padre o de las hijas
	 */
	public static void añadirArray(Poligono pol) {
		int i = 0;
		while (i < lista.length && lista[i] != null) {
			i++;
		}

		if (i < lista.length) {
			lista[i] = pol;
		}
	}

	/**
	 * Funcion que imprime el array
	 */
	public static void imprimirArray() {
		for (Poligono valor : lista) {
			if (valor != null) {
				System.out.println(valor);
			}
		}
	}
}
