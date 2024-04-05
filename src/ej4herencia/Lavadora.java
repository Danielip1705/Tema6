package ej4herencia;

public class Lavadora extends Electrodomestico {

	private int carga = 5;
	
	public Lavadora () {
		
	}
	
	public Lavadora (double precio, int peso) {
		super(precio,peso);
	}
	
	public Lavadora(double precio, String color, char conE, int peso,int carga) {
		super(precio,color,conE,peso);
		
		if(carga >=0) {
			this.carga = carga;
		}
	}

	public int getCarga() {
		return carga;
	}
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		
		if(carga >30) {
			super.precioBase+=30;
		}
	}
}
