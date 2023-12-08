package funcionesatributos.ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

import funcionesatributos.ejercicio01.Operaciones;

public class Main {

	// Creamos el escaner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Creamos una variable para recoger la opción elegida, otra para el radio de la
		// base, otra para la áltura y una para el resultado
		int opc;
		double radio, altura, res;
		Cilindro op;
		// Llamamos a la función que pide el radio de la base y lo recogemos
		radio = pideRadioBase();
		// LLamamos a la funcion que pide la áltura del cilindro y lo recogemos
		altura = altura();
		// Llamamos a la función que muestra el menú y nos devuelve la opción elegida
		opc = menu();

		op = new Cilindro(radio, altura);
		// Ahora gracias a un switch llamaremos a la función correspondiente a la opc
		// elegida o saldremos del programa y mostraremos por pantalla el resultado
		switch (opc) {
		case 1 -> {
			res = op.volumen();
			System.out.println(res);
		}
		case 2 -> {
			res = op.area();
			System.out.println(res);
		}
		default -> {
			System.out.println("Saliendo...");
		}
		}
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
			System.out.println("1. Volumen");
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
		// Devolvemos la opción
		return opc;
	}

	// Creamos una función que pedira el radio de la base y la devolvera
	public static double pideRadioBase() {
		// Creamos una variable para recoger el radio
		double radio = -1;
		// Comprobamos que el número es mayor a 0
		do {
			// Comprobamos que el tipo introducido es el correcto
			try {
				// Pedimos la opción
				System.out.println("Dame el radio, tiene que ser mayor que 0");
				radio = sc.nextInt();
				// Si nos sale error
			} catch (InputMismatchException e) {
				// Mandamos un mensaje diciendo que el tipo es incorrecto
				System.out.println("El formato no es el correcto");
				sc.nextLine();
			}
		} while (radio <= 0);
		// Devolvemos el radio
		return radio;
	}

	// Creamos una función que pedira el radio de la base y la devolvera
	public static double altura() {
		// Creamos una variable para recoger el radio
		double alt = -1;
		// Comprobamos que el número es mayor a 0
		do {
			// Comprobamos que el tipo introducido es el correcto
			try {
				// Pedimos la opción
				System.out.println("Dame la altura, tiene que ser mayor que 0");
				alt = sc.nextInt();
				// Si nos sale error
			} catch (InputMismatchException e) {
				// Mandamos un mensaje diciendo que el tipo es incorrecto
				System.out.println("El formato no es el correcto");
				sc.nextLine();
			}
		} while (alt <= 0);
		// Devolvemos el radio
		return alt;
	}

}
