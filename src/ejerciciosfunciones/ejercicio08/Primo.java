package ejerciciosfunciones.ejercicio08;
import ejerciciosfunciones.ejercicio07.*;

public class Primo {
	public static int divisorPrimo(int num) {
		int divisorPrimo=0;
		
		for (int i=1;i<=num/2;i++) {
			if ((num%i)==0) {
				if (Numero.primo(i)) {
					divisorPrimo++;
				}
			}
		}
		
		
		return divisorPrimo;
	}
}
