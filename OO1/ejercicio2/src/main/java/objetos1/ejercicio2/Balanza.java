package objetos1.ejercicio2;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public void ponerEnCero() {
		this.setCantidadDeProductos(0);
		this.setPrecioTotal(0);
		this.setPesoTotal(0);
	}
	
	public void agregarProducto (Producto producto) {
		this.setCantidadDeProductos(getCantidadDeProductos() + 1);
		this.setPrecioTotal(this.getPrecioTotal() + producto.getPrecio());
		this.setPesoTotal(this.getPesoTotal() + producto.getPeso());
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(getCantidadDeProductos(), getPesoTotal(), getPrecioTotal());
		return ticket;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	
}
