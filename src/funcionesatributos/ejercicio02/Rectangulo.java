package funcionesatributos.ejercicio02;

public class Rectangulo {
	double ancho, alto;

	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	double perimetro() {
		return ancho*2 + alto*2;
	}

	double area() {
		return ancho*alto;
	}
	
}
