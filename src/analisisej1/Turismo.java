package analisisej1;

public class Turismo extends Vehiculo {

	
	enum tipo {
		PROFESIONAL,PARTICULAR
	}
	private tipo tipoUso;
	
	private int plazas;
	
	public Turismo(String marca, String modelo, String color,String matricula,int plazas, String tipoUso) {
		super(marca, modelo, color, matricula);

		if(plazas>0) {
			this.plazas = plazas;
		}
		if(tipoUso!=null) {
			this.tipoUso = tipo.valueOf(tipoUso);
		}
	}
	
}
