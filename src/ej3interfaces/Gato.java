package ej3interfaces;

public class Gato extends AnimalDomestico {

	/**
	 * Constructor con parametros de la clase padre
	 * 
	 * @param nombre Cadena que contiene un nombre
	 * @param raza   Cadena que contiene una raza
	 * @param peso   Numero decimal que contiene el peso
	 * @param color  Cadena que contiene un color
	 */
	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	/**
	 * Funcion que imprime una cadena representado al animal que esta haciendo ruido
	 */
	@Override
	public void hacerRuido() {
		System.out.println("El gato llamado " + nombre + " dice: MIAU MIAU");

	}

	/**
	 * Funcion que devuelve un booleano true si ha hecho caso el gato
	 */
	@Override
	boolean hacerCaso() {
		boolean caso = false;
		int aleatorio = (int) (Math.random() * 101);
		if (aleatorio <= 5) {
			caso = true;
		}
		return caso;
	}

	/**
	 * Funcion que indica que gato se ha vacunado
	 */
	@Override
	void vacunar() {
		System.out.println("El gato llamado " + nombre + " a sido vacunado");
	}

	/**
	 * Funcion que indica que gato esta comiendo
	 */
	@Override
	public void comer() {
		System.out.println("El gato llamado " + nombre + " esta comiendo");
	}

	/**
	 * Funcion que indica que gato ha solado una bola de pelo
	 */
	void toserBolaPelo() {
		System.out.println("El gato llamado " + nombre + " ha soltado una bola de pelo");
	}
}
