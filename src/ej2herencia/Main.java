package ej2herencia;

public class Main {

	public static void main(String[] args) {

		// Creamos objeto de la clase padre Empleado con cadena nombre
		Empleado em = new Empleado("Daniel");
		// Creamos objeto hijo Directivo con cadena nombre
		Directivo dir = new Directivo("Patata");
		// Creamos objeto hijo Operario con cadena nombre
		Operario op = new Operario("Evelyn");
		// Creamos objeto hijo Oficial con cadena nombre
		Oficial of = new Oficial("Santiago");
		// Creamos objeto hijo Tecnico con cadena nombre
		Tecnico tec = new Tecnico("Pablo");

		// Imprimimos los objetos en consola
		System.out.println(em);
		System.out.println(dir);
		System.out.println(op);
		System.out.println(of);
		System.out.println(tec);
	}

}
