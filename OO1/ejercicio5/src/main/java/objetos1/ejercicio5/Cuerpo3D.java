package objetos1.ejercicio5;

public class Cuerpo3D {
	private double altura;
	private Figura caraBasal;
	
	public Cuerpo3D() {
		setAltura(0);
	}
	
	public Cuerpo3D(double altura, Figura caraBasal) {
		setAltura(altura);
		setCaraBasal(caraBasal);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Figura getCaraBasal() {
		return caraBasal;
	}

	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen(){
		return getCaraBasal().getArea() * getAltura();
	}
	
	public double getSuperficieExterior() {
		return 2 * getCaraBasal().getArea() + getCaraBasal().getPerimetro() * getAltura();
	}
}
