package objetos1.ejercicio4;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto() {
		this.setPeso(0);
		this.setPrecioPorKilo(0);
		this.setDescripcion("");
	}
	
	public Producto(double peso, double precioPorKilo, String descripcion) {
		this.setPeso(peso);
		this.setDescripcion(descripcion);
		this.setPrecioPorKilo(precioPorKilo);
	}
	
	public double getPrecio() {
		return this.getPeso() * this.getPrecioPorKilo();
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPrecioPorKilo() {
		return precioPorKilo;
	}
	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}