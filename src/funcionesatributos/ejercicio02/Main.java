package funcionesatributos.ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// Creamos el escaner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Creamos una variable para recoger la opción elegida, otra para la altura,
		// para el ancho y otra para el resultado
		int opc;
		double alt, anch, res = 0;
		Rectangulo rc;
		// LLamamos a la funcion que pide el ancho y lo recogemos
		anch = pideAncho();
		// LLamamos a la funcion que pide la áltura y lo recogemos
		alt = pideAlto();
		// Llamamos a la función que muestra el menú y nos devuelve la opción elegida
		opc = menu();
		rc = new Rectangulo(anch, alt);
		// Ahora gracias a un switch llamaremos a la función correspondiente a la opc
		// elegida o saldremos del programa
		switch (opc) {
		case 1 -> {
			res = rc.perimetro();
		}
		case 2 -> {
			res = rc.area();
		}
		case 0 -> {
			System.out.println("Saliendo...");
		}
		}
		// mostraremos por pantalla el resultado
		System.out.println("El resultado es " + res);
		// Cerramos el escaner
		sc.close();
	}

	// Creamos una función que mostrara un menú por pantalla y devuelve la opción
	// elegida por el usuario
	public static int menu() {
		// Creamos una variable para recoger el número de la opción
		int opc = -1;
		// Comprobamos que la opción este entre 0 y 3
		do {
			// Mostramos el Menú por pantalla
			System.out.println("************");
			System.out.println("****Menú****");
			System.out.println("************");
			System.out.println("1. Perimetro");
			System.out.println("2. Área");
			System.out.println("0. Salir");
			System.out.println("************");
			// Comprobamos que el tipo introducido es el correcto
			try {
				// Pedimos la opción
				System.out.println("Elige una opción entre las disponibles");
				opc = sc.nextInt();
				// Si nos sale error
			} catch (InputMismatchException e) {
				// Mandamos un mensaje diciendo que el tipo es incorrecto
				System.out.println("El formato no es el correcto");
				sc.nextLine();
			}
		} while (opc < 0 || opc > 2);
		return opc;
	}

	// Creamos una función que pedira la anchura y la devolvera
	public static double pideAncho() {
		System.out.println("Dame la anchura de la figura");
		return sc.nextDouble();
	}

	// Creamos una función que pedira la altura y la devolvera
	public static double pideAlto() {
		System.out.println("Dame la altura de la figura");
		return sc.nextDouble();
	}

}
