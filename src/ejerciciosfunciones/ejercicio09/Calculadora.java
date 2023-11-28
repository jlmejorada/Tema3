package ejerciciosfunciones.ejercicio09;

public class Calculadora {

	public static float operacion(int num1, int num2, int opc) {
		float res=0;
		switch (opc) {
		case 1 ->{
			res=num1+num2;
		}
		case 2 ->{
			res=num1-num2;
		}
		case 3 ->{
			res=num1*num2;
		}
		case 4 ->{
			res=(float)num1/num2;
		}
		}
		return res;
	}
}
