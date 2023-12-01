package funcionesatributos.ejercicio03;

public class Circulo {
	double radio;

	public Circulo() {
		
	}

	public Circulo(double radio) {
		this.radio = radio;
		
	}
	
	double circunferencia() {
		return 2*Math.PI*radio;
	}
	
	double area(){
		return Math.PI*Math.pow(radio,2);
	}
	
}
