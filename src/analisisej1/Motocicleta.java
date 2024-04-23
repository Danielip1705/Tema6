package analisisej1;

public class Motocicleta extends Vehiculo {

	private int cilindrada;
	private String carnet;
	
	public Motocicleta(String marca, String modelo, String color, int cilindrada) {
		super(marca, modelo, color);
		
		if(cilindrada>0) {
			this.cilindrada=cilindrada;
		}
		
		this.carnet = cilindrada >= 125 ? "Si" : "No";
	}
	
}
