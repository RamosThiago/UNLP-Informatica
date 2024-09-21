package objetos1.ejercicio5;

public class Circulo implements Figura {
	
	private double radio;
	
	public Circulo() {
		setRadio(0);
	}
	
	public Circulo(double valor, Boolean esDiametro) {
		if (esDiametro) {
	        setDiametro(valor); 
	    } else {
	        setRadio(valor);  
	    }
	}
	
	public double getDiametro() {
		return this.radio * 2;
	}
	
	public void setDiametro(double diametro) {
        this.radio = diametro / 2;	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(), 2);
	}
		
}