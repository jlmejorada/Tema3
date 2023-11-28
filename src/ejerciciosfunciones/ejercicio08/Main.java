package ejerciciosfunciones.ejercicio08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variable para guarda un número y otro para tener el número de divisores primos
		int num=0, primos;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Comprobamos que sea un número positivo
		do {
			// Comprobamos que el formato está bien
			try {
				// Pedimos el primer número
				System.out.println("Dame un número para saber cuantos divisores primos tiene");
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El formato no es el correcto");
				sc.nextLine();
			}
		} while (num <= 0);
		
		//Llamamos a la funcion y recogemos los números de divisores
		primos=Primo.divisorPrimo(num);
		
		//Mostramos el mensaje por pantalla
		System.out.println(num + " tiene " + primos + " divisores primos");

		//Cerramos el escaner
		sc.close();
	}

}
