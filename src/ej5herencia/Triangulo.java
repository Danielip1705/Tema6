package ej5herencia;

public class Triangulo extends Poligono{
	private double lado1;
	private double lado2;
	private double lado3;
	
	
	public Triangulo(int numeroLados) {
		super(numeroLados);
	}


	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
		super(numeroLados);
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
		if (lado3 > 0) {
			this.lado3 = lado3;
		}	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (lado1+lado2+lado3)/2;
	}


	@Override
	public String toString() {
		String cad = super.toString();
		cad+= "Lado 1: " +lado1+"\n";
		cad+= "Lado 2: " +lado2+"\n";
		cad+= "Base: " +lado3+"\n";
		cad+= "Area: " +area()+"\n";
		
		
		return cad;
	}
	
	
	
	
}
