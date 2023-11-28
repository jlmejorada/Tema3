package ejerciciosfunciones.ejercicio07;

public class Numero {

	public static boolean primo(int num) {
		boolean primo=true;
		
		if (num!=1) {
			for (int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					primo=false;
				}
			}
		} else primo=false;
		
		return primo;
	}
}
