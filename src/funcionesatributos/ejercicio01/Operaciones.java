package funcionesatributos.ejercicio01;

public class Operaciones {
	//Creamos los atributos
	double num1, num2;
	
	//Creamos un constructor
	public Operaciones(double num1, double num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	//Creamos una funcion que sume los dos numeros
	double suma() {
		//devolvemos el resultado
		return num1+num2;
	}
	//Creamos una funcion que reste los dos numeros
	double resta() {
		//devolvemos el resultado
		return num1-num2;
	}
	//Creamos una funcion que multiplique los dos numeros
	double multiplicacion() {
		//devolvemos el resultado
		return num1*num2;
	}
	//Creamos una funcion que multiplique los dos numeros
	double division() {
		//devolvemos el resultado
		return num1/num2;
	}
	//Creamos una funcion que mire cual es el número menor
	double numMax() {
		double res;
		if (num1<num2) {
			res = num2;
		} else res = num1;
		//devolvemos el resultado
		return res;
	}
	//Creamos una funcion que mire cual es el número menor
	double numMin() {
		double res;
		if (num1<num2) {
			res = num1;
		} else res = num2;
		//devolvemos el resultado
		return res;
	}

}
