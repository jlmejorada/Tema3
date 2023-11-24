package ejerciciosfunciones.ejercicio6;

public class Calculo {

	public static void cilindro (int opcion, double altura, double radio) {
		double res=0;
		
		switch (opcion) {
			case 1 -> {
				res=(2*Math.PI) * radio * (altura+radio);
			}
			case 2 ->{
				res= Math.PI * Math.pow(radio,2) * altura;			
			}
		}
		
		System.out.println("El resultado de la operación es " + res);
	}
}
