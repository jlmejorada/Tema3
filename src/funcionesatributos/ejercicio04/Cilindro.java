package funcionesatributos.ejercicio04;

public class Cilindro {
	// Creamos los atributos
	double radioBase, altura;

	// Generamos un constructor con parametros
	public Cilindro(double radioBase, double altura) {
		this.radioBase = radioBase;
		this.altura = altura;
	}

	// Generamos un constructor sin parametros
	public Cilindro() {
	}

	// Creamos una funcion que calcule el volumen del cilindro
	double volumen() {
		// Creamos una variable para el resultado
		double res;
		// Realizamos la operación que es PI * Altura * radio^2
		res = Math.PI * altura * Math.pow(radioBase, 2);
		// devolvemos el resultado
		return res;
	}

	// Creamos una funcion que calcule el area del cilindro
	double area() {
		// Creamos una variable para el resultado
		double res;
		// Realizamos la operación que es 2*PI*radio*altura + 2*PI*radio^2
		res = (2 * Math.PI * radioBase * altura) + (2 * Math.PI * Math.pow(radioBase, 2));
		// devolvemos el resultado
		return res;
	}
}
