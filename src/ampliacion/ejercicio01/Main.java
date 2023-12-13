package ampliacion.ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// Creamos el escaner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Creamos una variable para recoger la opcion elegida, otra que nos registrará
		// si la funcion ha dado una respuesta positiva y otra para el número
		int opc = -1, num;
		boolean bandera=false;
		Numeros nm;
		// Hacemmos un bucle para que se repita el programa hasta que se introduzca la
		// opción 0
		do {
			// Mostramos el Menú y recogemos la opción
			opc = menu();
			// Si la opción es distinta de 0, continua con el programa, si no, se lo salta
			if (opc != 0) {
				// Pedimos el número con el que trabajará
				num = numero();
				// A traves del siguiente switch, llamaremos a las funciones correspondientes y
				// según lo que nos devuelva, podemos mandar un mensaje u otro
				nm = new Numeros(num);
				switch (opc) {
				case 1 -> {
					bandera = nm.esPrimo();
					if (bandera) {
						System.out.println(num + " es primo");
					} else
						System.out.println(num + " no es primo");
				}
				case 2 -> {
					bandera = nm.esCapicua();
					if (bandera) {
						System.out.println(num + " es capicua");
					} else
						System.out.println(num + " no es capicua");
				}
				}
			}
		} while (opc != 0);
		// Cerramos el escaner
		sc.close();
	}

	public static int menu() {
		// Creamos una variable para recoger el número de la opción
		int num = -1;
		// Nos aseguramos que el número este en el rango correcto y si no, se repita el
		// bucle
		do {
			// Mostramos el Menú por pantalla
			System.out.println("***************");
			System.out.println("1. Primo");
			System.out.println("2. Capicua");
			System.out.println("0. Salir");
			System.out.println("***************");
			// Nos aseguramos que la opción introducida sea del formato correcto
			try {
				// Pedimos la opción
				System.out.println("Elige una opción");
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				// Mandamos un mensaje diciendo que el tipo es incorrecto
				System.out.println("El formato no es el correcto");
				sc.nextLine();
			}
		} while (num < 0 || num > 2);
		// Devolvemos la opción
		return num;
	}

	public static int numero() {
		// Creamos una variable para recoger el número
		int num=-1;
		// el bucle se repetira hasta que se introduzca un número positivo
		do {
			// Nos aseguramos que la opción introducida sea del formato correcto
			try {
				// Pedimos la opción
				System.out.println("Dame un número");
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				// Mandamos un mensaje diciendo que el tipo es incorrecto
				System.out.println("El formato no es el correcto");
				sc.nextLine();
			}
		} while (num < 0);
		// Devolvemos el número
		return num;
	}
}
