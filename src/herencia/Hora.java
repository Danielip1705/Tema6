package herencia;

public class Hora {

	protected int horas;
	protected int minutos;

	public Hora(int hora, int minuto) {
		if (hora >= 0 && hora < 24) {
			this.horas = hora;
		}
		if (minutos >= 0 && minutos < 24) {
			this.minutos = minuto;
		}
	}

	public void inc() {
		minutos++;
		if (minutos ==60) {
			minutos = 0;
			horas++;
		} 
		if (horas ==24) {
			horas = 0;
			minutos = 0;
		}
	}

	public boolean setMinutos(int valor) {
		boolean valido = false;

		if (valor > 0 && valor < 60) {
			minutos++;
			valido = true;
		}
		return valido;
	}

	public boolean setHora(int valor) {
		boolean valido = false;

		if (valor > 0 && valor < 60) {
			horas++;
			valido = true;
		}
		return valido;
	}
	
	public String toString() {
		String cad="";
		if(horas<10&&minutos<10) {
			cad+="0"+this.horas+":0"+this.minutos;
		}
		if(horas<10&&minutos>=10) {
			cad+="0"+this.horas+":"+this.minutos;
		}
		if(horas>=10&&minutos<10) {
			cad+=this.horas+":0"+this.minutos;
		}
		if(horas>=10&&minutos>=10) {
			cad+=this.horas+":"+this.minutos;
		}
		
		return cad;
	}
}
