package ejerciciosfunciones.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Creamos una variable para los números introducidos
		int num1=0, num2=0;
		
		//Creamos una variable para comprobar que el número introducido tiene el formato correcto
		boolean bandera;
		
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Este bucle terminara cuando el formato del número sea el correcto
		do {
			bandera=false;
			//Comprobamos que el tipo introducido es el correcto
			try {
				//Pedimos el primer número
				System.out.println("Dame un número");
				num1=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El formato no es el correcto");
				sc.nextLine();
				bandera=true;
			}
		} while(bandera);
		
		//Este bucle terminara cuando el formato del número sea el correcto
		do {
		bandera=false;
			//Comprobamos que el tipo introducido es el correcto
			try {
				//Pedimos el segundo número
				System.out.println("Dame otro número");
				num2=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El formato no es el correcto");
				sc.nextLine();
				bandera=true;
			}
		} while(bandera);
		
		//Vemos si los dos números introducidos no son el mismo
		if (num1!=num2) {
			//Vemos que número es el mayor y el menor, y según pasamos en orden distintos a los parametros
			if (num1<num2) {
				Numeros.entre(num1, num2);
			} else {
				Numeros.entre(num2, num1);
			}
		} else System.out.println("Los números no pueden ser iguales");
		
		//Cerramos el escaner
		sc.close();

	}

}
