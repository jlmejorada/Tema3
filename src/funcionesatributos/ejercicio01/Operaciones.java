package funcionesatributos.ejercicio01;

public class Operaciones {
	//Creamos los atributos
	double num1, num2;
	
	//Creamos un constructor
	public Operaciones(double num1, double num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	double suma() {
		return num1+num2;
	}
	
	double resta() {
		return num1-num2;
	}
	
	double multiplicacion() {
		return num1*num2;
	}
	
	double division() {
		return num1/num2;
	}
	
	double numMax() {
		if (num1<num2) {
			return num2;
		} else return num1;
	}
	
	double numMin() {
		if (num1<num2) {
			return num1;
		} else return num2;
	}

}
