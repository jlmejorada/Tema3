package ejerciciosfunciones.ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creamos una variable que recoja un caracter
		char letra=' ';
		
		//Creamos una variable bool que sirva de bandera, para recoger el dato y otra para ver si es primo
		boolean bandera, vocal;
		
		//Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Este bucle terminara cuando el formato del número sea el correcto
		do {
			bandera = false;
			// Comprobamos que el tipo introducido es el correcto
			try {
				// Pedimos el primer número
				System.out.println("Dame una letra");
				letra = sc.next().charAt(0);
			} catch (InputMismatchException e) {
				System.out.println("El formato no es el correcto");
				sc.nextLine();
				bandera = true;
			}
		} while (bandera);
		
		//Llamamos a la funcion y recogemos la salida
		vocal = Palabra.vocal(letra);
		
		//Hacemos un if que nos diga si es verdadero o falso y en consecuencia, mostraremos un mensaje
		if (vocal) {
			System.out.println("Es una vocal");
		} else System.out.println("No es una vocal");
		
		//Cerramos el escaner
		sc.close();

	}

}
