package ej3herencia;

public class Main3 {

	public static void main(String[] args) {
		// Creamos objeto de la clase Productos con valores ya inicializados
		Productos po = new Productos("Arroz", 1);
		// Creamos objeto de la clase perecedero con valores ya inicializados
		Perecedero pe = new Perecedero("Arroz", 1, 1);
		// Creamos objeto de la clase noPerecedero
		NoPerecedero nPe = new NoPerecedero("Arroz", 1, "si");
		// Imprimimos en pantalla el objeto producto
		System.out.println("Objeto Producto");
		System.out.println(po);
		/// Imprimimos objeto Perecedero
		System.out.println("Objeto Perecedero");
		System.out.println(pe);
		// Imprimimos objeto NoPerecedero
		System.out.println("Objeto NoPerecedero");
		System.out.println(nPe);

		// Calculamos el precio de los objetos si hay 10 cantidades
		po.calcular(10);
		pe.calcular(10);
		nPe.calcular(10);
		// Imprimimos de nuevo los objetos con el precio calculado
		System.out.println("---------------------------------------------------------------");
		System.out.println("Calculado precio total de las 10 cantidades...");
		System.out.println("Objeto Producto");
		System.out.println(po);
		System.out.println("Objeto Perecedero");
		System.out.println(pe);
		System.out.println("Objeto NoPerecedero");
		System.out.println(nPe);
	}

}
