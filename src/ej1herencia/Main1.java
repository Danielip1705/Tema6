package ej1herencia;

public class Main1 {

	public static void main(String[] args) {
		// Creamos el objeto hora y le añadimos los parametros de entrada del
		// constructor
		Hora hora = new Hora(9, 59);
		// Imprimimos hora
		System.out.println("Hora: " + hora);
		// Incrementamos los minutos
		hora.inc();
		// Imprimimos la hora
		System.out.println("Hora después de incrementar los minutos: " + hora);
		// Declaramos con if que si el resultado de la funcion setMinutos es true
		if (hora.setMinutos(45)) {
			// Imprimimos que el cambia a sido posible
			System.out.println("Se ha podido cambiar los minutos");
			// Imprimimos hora
			System.out.println("Hora después de cambiar los minutos: " + hora);
			// y si no
		} else {
			// Imprimimos que no se ha podido realizar el cambio
			System.out.println("No se ha podido cambiar los minutos");
		}
		// Declaramos con if que si el resultado de sethora es true
		if (hora.setHora(11)) {
			// Imprimimos en consola que se ha podido realizar el cambio
			System.out.println("Se ha podido cambiar la hora");
			// Imprimimos hora
			System.out.println("Hora después de cambiar la hora: " + hora);
			// y si no
		} else {
			// Imprimimos que no se ha podido realizar el cambios
			System.out.println("No se ha podido cambiar los minutos");
		}
		// Creamos objeto horaExactale y le añadimos los parametros de entrada del
		// constructor
		HoraExacta horaExacta = new HoraExacta(14, 20, 59);
		// Imprimimos la hora exacta
		System.out.println("Hora exacta: " + horaExacta);
		// Aumentamos los segundos
		horaExacta.inc();
		// Imprimimos la hora exacta
		System.out.println("Hora exacta después de incrementar los segundos: " + horaExacta);

		// cambiamos los segundos
		horaExacta.setSegundo(50);
		// Declaramos con if que si el resultado de setSegundos es true
		if (horaExacta.setSegundo(50)) {
			// Imprimimos que el cambia se ha realizado
			System.out.println("Se ha podido cambiar los segundos");
			// Imprimimos los segundos
			System.out.println("Hora exacta después de cambiar los segundos: " + horaExacta);
			// Y si no
		} else {
			// Imprimimos que no se ha podido cambiar
			System.out.println("No se ha podido cambiar");
		}

	}

}
