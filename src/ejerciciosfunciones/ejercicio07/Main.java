package ejerciciosfunciones.ejercicio07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creamos una variable para recoger un numero entero y un booleano para si es
		// primo o no
		int num = 0;
		boolean esPrimo=false;

		//Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que sea un número positivo
		do {
			// Comprobamos que el formato está bien
			try {
				// Pedimos el primer número
				System.out.println("Dame un número para saber si es primo");
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El formato no es el correcto");
				sc.nextLine();
			}
		} while (num <= 0);
		
		//Llamamos a la función 
		esPrimo=Numero.primo(num);
		
		//Vemos si es true o false y pasamos un mensaje en consecuencia
		if (esPrimo) {
			System.out.println("El número es primo");
		} else System.out.println("El número no es primo");
		
		//Cerramos el escaner
		sc.close();

	}

}
