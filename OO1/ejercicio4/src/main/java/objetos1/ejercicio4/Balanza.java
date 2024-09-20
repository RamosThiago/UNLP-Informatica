package objetos1.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private List<Producto> productos;
	
	public Balanza() {
		setProductos(new ArrayList<Producto>());
	}
	
	public void ponerEnCero() {
		setProductos(new ArrayList<Producto>());
	}
	
	public void agregarProducto (Producto producto) {
		List<Producto> newList = getProductos();
		newList.add(producto);
		this.setProductos(newList);
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(getCantidadDeProductos(), getPesoTotal(), getPrecioTotal(), getProductos());
		return ticket;
	}

	public int getCantidadDeProductos() {
		return getProductos().size();
	}

	public double getPrecioTotal() {
		double precioTotal = 0;
		for(Producto producto : getProductos()) {
			precioTotal = precioTotal + producto.getPrecio();
		}
		return precioTotal;
	}

	public double getPesoTotal() {
		double pesoTotal = 0;
		for(Producto producto : getProductos()) {
			pesoTotal = pesoTotal + producto.getPeso();
		}
	return pesoTotal;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
