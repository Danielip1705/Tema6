package ej3interfaces;

public class Main3 {

	public static void main(String[] args) {

		// Creamos objetos gatos y perros
		Perro per1 = new Perro("Princesita", "Bulldog", 45.2, "Negro");
		Perro per2 = new Perro("Destructor Galactico", "Caniche", 5, "Marrón");
		Gato gat1 = new Gato("Garfiled", "Gato Persa", 5, "Amarillo");
		Gato gat2 = new Gato("Bills", "Cornish rex", 7, "Morado");

		// Hacemos que el objeto perro coma
		per1.comer();
		// Hacemos que el objeto gato coma
		gat1.comer();

		// Hacemos que el objeto perro haga ruido
		per2.hacerRuido();
		// Hacemos que el objeto gato duerma
		gat2.dormir();
		// Hacemos que el objeto gato haga ruida
		gat1.hacerRuido();

		// Llamamos a la funcion hacerCaso
		if (gat1.hacerCaso()) {

			// Si el resultado es true, imprimimos que ha hecho caso
			System.out.println("El gato te ha hecho caso");
			// Y si no
		} else {
			// Imprimimos que el gato no ha hecho caso
			System.out.println("El gato no te ha hecho caso");
		}
		// DEclaramos con if que si la funcion hacerCaso es true
		if (per1.hacerCaso()) {
			// Imprimimos por consola que el perro ha hecho caso
			System.out.println("El perro te ha hecho caso");
			// Y si no
		} else {
			// Imprimimos que no ha hecho caso
			System.out.println("El perro no te ha hecho caso");
		}
	}

}
