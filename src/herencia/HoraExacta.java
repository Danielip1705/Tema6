package herencia;

public class HoraExacta extends Hora {

	private int segundos;

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);

		if (segundos > 0 && segundos < 60) {
			this.segundos = segundo;
		}
	}

	boolean setSegundo(int valor) {
		boolean valido = false;

		if (valor > 0 && valor < 60) {
			segundos++;
			valido = true;
		}
		return valido;

	}

	@Override
	public void inc() {
		segundos++;
		if (segundos == 60) {
			segundos = 0;
			super.inc();
		}
	}

	@Override
	public String toString() {
		String cad = "";
		if (horas < 10 && minutos < 10) {
			cad += "0" + this.horas + ":0" + this.minutos;
		}
		if (horas < 10 && minutos >= 10) {
			cad += "0" + this.horas + ":" + this.minutos;
		}
		if (horas >= 10 && minutos < 10) {
			cad += this.horas + ":0" + this.minutos;
		}
		if (horas >= 10 && minutos >= 10) {
			cad += this.horas + ":" + this.minutos;
		}
		
		return cad;
	}

}
