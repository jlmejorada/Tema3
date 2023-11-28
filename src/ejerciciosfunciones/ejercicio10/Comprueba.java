package ejerciciosfunciones.ejercicio10;

public class Comprueba {
	public static boolean fecha(int dia, int mes, int ano) {
		boolean fechaCorrecta=false;
		
		if((dia >=1 && dia<=30)&&(mes>=1 && mes<=12 )&& (ano >0 && ano<=2023)) {
			fechaCorrecta=true;
		}
		
		return fechaCorrecta;
	}
}
