package ejerciciosfunciones.ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creamos las variables para guardar la altura, el radio y la opción
		double altura = 0, radio = 0;
		int opcion=0;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Comprobamos que sea un número positivo
		do {
			// Comprobamos que el formato está bien
			try {
				// Pedimos el primer número
				System.out.println("Dame un número para la altura, tiene que se un número positivo");
				altura = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("El formato no es el correcto");
				sc.nextLine();
			}
		} while (altura <= 0);

		// Comprobamos que sea un número positivo
		do {
			// Comprobamos que el formato está bien
			try {
				// Pedimos el primer número
				System.out.println("Dame un número para el radio, tiene que se un número positivo");
				radio = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("El formato no es el correcto");
				sc.nextLine();
			}
		} while (radio <= 0);

		// Comprobamos que sea una de las dos opciones
		do {
			// Comprobamos que es un número entero
			try {
				// Pedimos el primer número
				System.out.println("Selecciona la opción");
				System.out.println(" 1. Área");
				System.out.println(" 2. Volumen");
				opcion = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El formato no es el correcto");
				sc.nextLine();
			}
		} while (opcion != 1 && opcion != 2);

		//Llamamos a la funcion
		Calculo.cilindro(opcion, altura, radio);
		
		// Cerramos el escaner
		sc.close();
	}

}
