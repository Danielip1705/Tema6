package ej3interfaces;

public class Perro extends AnimalDomestico {

	/**
	 * Constructor con parametros del padre
	 * 
	 * @param nombre Cadena que contiene un nombre
	 * @param raza   Cadena que contiene una raza
	 * @param peso   Numero decimal que contiene el peso
	 * @param color  Cadena que contiene un color
	 */
	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	/**
	 * Funcion que indica que perro ha hecho ruido
	 */
	@Override
	public void hacerRuido() {
		System.out.println("El perro llamado " + nombre + " dice: WOOF WOOF");
	}

	/**
	 * Funcion que indica si el perro ha hecho caso
	 */
	@Override
	boolean hacerCaso() {
		boolean caso = false;
		int aleatorio = (int) (Math.random() * 101);
		if (aleatorio <= 90) {
			caso = true;
		}
		return caso;

	}

	/**
	 * Funcion que indica que perro ha comido
	 */
	@Override
	public void comer() {
		System.out.println("El perro llamado " + nombre + " esta comiendo");
	}

	/**
	 * Funcion que indica que perro se ha sacado ha pasear
	 */
	void sacarPaseo() {
		System.out.println("Has sacado a " + nombre + "a pasear");
	}

	/**
	 * Funcion que indica que perro ha sido vacunado
	 */
	@Override
	void vacunar() {
		System.out.println("El perro llamado " + nombre + " a sido vacunado");
	}
}
