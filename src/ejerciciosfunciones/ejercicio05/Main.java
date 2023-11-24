package ejerciciosfunciones.ejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creamos una variable para recoger un número entero
		int num=0;
		
		//Creamos una booleana para controlar el bucle de pedida de datos
		boolean bandera;
		
		//Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Creamos un  bucle para que pida el número hasta que se introduzca un caracter correcto
		do {
			bandera=false;
			//Controlamos que la variable sea del tipo correcto
			try {
				//Pedimos un número y lo registramos
				System.out.println("Dame un número y te imprimo la tabla de multiplicar");
				num=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El tipo de dato introducido no es correcto");
				sc.nextLine();
				bandera=true;
			}
		} while (bandera);
		
		//Pasamos el número como parametro
		Numero.mul(num);
		
		//Cerramos el escaner
		sc.close();
	}

}
