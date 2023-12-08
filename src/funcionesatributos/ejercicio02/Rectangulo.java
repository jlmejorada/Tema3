package funcionesatributos.ejercicio02;

public class Rectangulo {
	// Creamos los atributos
	double ancho, alto;

	// Generamos un constructor con parametros
	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	// Calculamos el perimetro y lo devolvemos
	double perimetro() {
		return ancho*2 + alto*2;
	}

	// Calculamos el área y lo devolvemos
	double area() {
		return ancho*alto;
	}
	
}
