package objetos1.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto() {
		this.setFecha(LocalDate.now());
		this.setCliente("");
		List<Item> emptyList = new ArrayList<Item>();
		this.setItems(emptyList);
	}
	
	public Presupuesto(String cliente) {
		this.setFecha(LocalDate.now());
		this.setCliente(cliente);
		List<Item> emptyList = new ArrayList<Item>();
		this.setItems(emptyList);
	}
	
	public void agregarItem(Item item) {
		List<Item> newList = this.getItems();
		newList.add(item);
		this.setItems(newList);
	}
	
	public double calcularTotal() {
		List<Item> list = this.getItems();
		double total = 0;
		for(Item actualItem : list) {
			total = total + actualItem.costo(); 
		}
		return total;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
