package ejerciciosfunciones.ejercicio04;

public class Palabra {

	public static boolean vocal (char letra) {
		boolean vocal=false;
		
		//Hacemos un switch que en el caso de que sea vocal, mande true
		vocal= switch(Character.toLowerCase(letra)) {
		case 'a','e', 'i','o', 'u'  -> true;
		default-> false;
		};
		
		return vocal;
	}
}
