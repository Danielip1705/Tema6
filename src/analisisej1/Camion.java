package analisisej1;

public class Camion extends Vehiculo {

	private int pesoMax;
	private boolean mercPeligrosa;

	public Camion(String marca, String modelo, String color, int pesoMax, boolean mercPeligrosa) {
		super(marca, modelo, color);

		if (pesoMax > 0) {
			this.pesoMax = pesoMax;
		}
		this.mercPeligrosa = mercPeligrosa;
	}
}
