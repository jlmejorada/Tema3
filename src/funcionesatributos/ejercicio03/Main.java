package funcionesatributos.ejercicio03;

import java.util.Scanner;

public class Main {

	// Creamos el escaner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Creamos una variable para recoger la opción elegida, otra para el radio de la
		// base, otra para la áltura y una para el resultado
		int opc;
		double radio, res = 0;
		Circulo cl;
		// Llamamos a la función que pide el radio y lo recogemos
		radio = pideRadio();
		// Llamamos a la función que muestra el menú y nos devuelve la opción elegida
		opc = menu();

		cl = new Circulo(radio);
		// Ahora gracias a un switch llamaremos a la función correspondiente a la opc
		// elegida o saldremos del programa y mostraremos por pantalla el resultado
		switch (opc) {
		case 1 -> {
			res = cl.circunferencia();
		}
		case 2 -> {
			res = cl.area();
		}
		case 0 -> {
			System.out.println("Saliendo...");
		}
		}
		// y lo mostramos por pantalla
		System.out.println("El resultado es " + res);
		// Cerramos el escaner
		sc.close();
	}
	// Creamos una función que mostrara un menú por pantalla y devuelve la opción
	// elegida por el usuario
	public static int menu() {
		// Creamos una variable para recoger el número de la opción
		int num;
		// Mostramos el Menú por pantalla
		System.out.println("***************");
		System.out.println("1. Circunferencia");
		System.out.println("2. Área");
		System.out.println("0. Salir");
		System.out.println("***************");
		// Pedimos la opción
		System.out.println("Elige una opción");
		num = sc.nextInt();
		// Devolvemos la opción
		return num;
	}
	// Creamos una función que pedira el radio y la devolvera
	public static double pideRadio() {
		// Pedimos el radio
		System.out.println("Dame el radio");
		// Y lo devolvemos
		return sc.nextInt();
	}

}
