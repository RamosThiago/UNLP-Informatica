package objetos1.ejercicio5;

public class Cuadrado implements Figura {
	
	private double lado;
	
	public Cuadrado() {
		setLado(0);
	}
	
	public Cuadrado(double lado) {
		setLado(lado);
	}
	
	public void setLado(double valor) {
		this.lado = valor;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public double getPerimetro() {
		return getLado() * 4;
	}
	
	public double getArea() {
		return Math.pow(getLado(), 2);
	}
	
}
