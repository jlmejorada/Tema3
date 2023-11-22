package ejerciciosfunciones.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creamos una variable por cada número introducido y otra para el resultado
		int num1 = 0, num2 = 0, res=0;
		
		// Creamos una variable para comprobar que el número introducido tiene el formato correcto
		boolean bandera;

		// Creamos un escaner
		Scanner sc = new Scanner(System.in);

		// Este bucle terminara cuando el formato del número sea el correcto
		do {
			bandera = false;
			// Comprobamos que el tipo introducido es el correcto
			try {
				// Pedimos el primer número
				System.out.println("Dame un número");
				num1 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El formato no es el correcto");
				sc.nextLine();
				bandera = true;
			}
		} while (bandera);

		// Este bucle terminara cuando el formato del número sea el correcto
		do {
			bandera = false;
			// Comprobamos que el tipo introducido es el correcto
			try {
				// Pedimos el segundo número
				System.out.println("Dame otro número");
				num2 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El formato no es el correcto");
				sc.nextLine();
				bandera = true;
			}
		} while (bandera);
		
		//Llamamos a la funcion y recogemos el resultado
		res = Numeros.mayor(num1, num2);
		
		//Mostramos el resultado por pantalla
		System.out.println("El número mayor es " + res);

		//Cerramos el escaner
		sc.close();
	}

}
