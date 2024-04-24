package analisisej1;

public abstract class Vehiculo {

	private String marca = "";
	private String modelo = "";
	private String color = "";
	private String matricula="";
	private boolean motorEncedido = false;
	private int marcha;
	private double velocidad;

	public Vehiculo(String marca, String modelo, String color,String matricula) {

		if (marca != null && !marca.equals("")) {
			this.marca = marca;

		}

		if (modelo != null && !modelo.equals("")) {
			this.modelo = modelo;
		}
		if (color != null && !color.equals("")) {
			this.color = color;
		}
		if(matricula!=null && !matricula.equals("")) {
			this.matricula=matricula;
		}
	}

	
	public void setMotorEncedido(boolean motorEncedido) {
		this.motorEncedido = motorEncedido;
	}


	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}


	public void parar() {
		System.out.println("Parando...");
		motorEncedido = false;
	}

	public void arrancar() {
		System.out.println("Arrancando...");
		motorEncedido = true;
	}

	public void subirMarcha() {
		if (marcha <= 5) {
			if (motorEncedido) {
				marcha++;
			}
			switch (marcha) {
			case 0:
				System.out.println("Punto Muerto");
				break;
			case 1:
				velocidad = 30;
				break;
			case 2:
				velocidad = 50;
				break;
			case 3:
				velocidad = 70;
				break;
			case 4:
				velocidad = 100;
				break;
			case 5:
				velocidad = 100;
				break;
			default:
				System.out.println("Ya no hay mas marchas");
			}
			
		}

	}

	public void bajarMarcha() {
		if (marcha >=0) {
			if (motorEncedido) {
				marcha--;
			}
			switch (marcha) {
			case 0:
				System.out.println("Punto Muerto");
				break;
			case 1:
				velocidad = 30;
				break;
			case 2:
				velocidad = 50;
				break;
			case 3:
				velocidad = 70;
				break;
			case 4:
				velocidad = 100;
				break;
			case 5:
				velocidad = 100;
				break;
			default:
				System.out.println("Ya no hay mas marchas");
			}
			
		}
	}

	public void acelerar(double velUsuario) {
		while (velUsuario < velocidad) {
			subirMarcha();
			System.out.println("Marcha " + this.marcha);
		}

		System.out.println("Marcha " + this.marcha + " velocidad " + this.velocidad + " km");
	}

	public void mantenerVelocidad() {
		System.out.println("Manteniendo velocidad: Marcha " + this.marcha + " velocidad " + this.velocidad + " km");
	}
	
	
}
