package ejerciciosfunciones.ejercicio3;

public class Numeros {
	public static int mayor(int num1, int num2) {
		//Creamos una variable para el número maximo
		int numax;
		
		//Creamos un ternario que vea cual es el número mayor y se lo asigne a numax
		numax=(num1<num2)? num2 : num1 ;
		
		// y lo devolvemos
		return numax;
	}

}
