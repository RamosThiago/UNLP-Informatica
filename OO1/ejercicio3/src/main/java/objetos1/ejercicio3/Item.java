package objetos1.ejercicio3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item() {
		this.setDetalle("");
		this.setCantidad(0);
		this.setCostoUnitario(0);
	}
	
	public Item(String detalle, int cantidad, double costoUnitario) {
		this.setDetalle(detalle);
		this.setCostoUnitario(costoUnitario);
		this.setCantidad(cantidad);
	}
	
	public double costo() {
		return this.getCantidad() * this.getCostoUnitario();
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	
	
}
