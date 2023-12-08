package funcionesatributos.ejercicio03;

public class Circulo {
	// Creamos el atributo
	double radio;

	// Generamos un constructor sin parametros
	public Circulo() {
		
	}

	// Generamos un constructor con parametro
	public Circulo(double radio) {
		this.radio = radio;
		
	}
	
	// Creamos una funcion que calcule la circunferencia y lo devuelva
	double circunferencia() {
		return 2*Math.PI*radio;
	}
	
	// Creamos una funcion que calcule el area y lo devuelva
	double area(){
		return Math.PI*Math.pow(radio,2);
	}
	
}
