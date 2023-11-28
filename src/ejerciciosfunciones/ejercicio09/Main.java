package ejerciciosfunciones.ejercicio09;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// Variable para guardar los numeros, la opción y otro para el resultado
		int num1 = 0, num2=0, opc=0; 
		float res = 0;

		// Creamos una variable booleana para saber cuando salir del bucle mientra
		// pedimos el número
		boolean bandera;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		do {
			//Mostramos el menú y pedimos la opción que desea el usuario
			System.out.println("****************");
			System.out.println("******Menú******");
			System.out.println("****************");
			System.out.println("1 para sumar");
			System.out.println("2 para resta");
			System.out.println("3 para multiplicar");
			System.out.println("4 para dividir");
			System.out.println("****************");
			System.out.println("Elige una opción");
			opc=sc.nextInt();
		} while (opc!=1&&opc!=2&&opc!=3&opc!=4);
			
		// Comprobamos que sea un número positivo
		do {
			bandera=false;
			// Comprobamos que el formato está bien
			try {
				// Pedimos el primer número
				System.out.println("Dame un número");
				num1 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El formato no es el correcto");
				sc.nextLine();
				bandera=true;
			}
		} while (bandera);

		// Comprobamos que sea un número positivo
		do {
			bandera=false;
			// Comprobamos que el formato está bien
			try {
				// Pedimos el segundo número
				System.out.println("Dame otro número");
				num2 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El formato no es el correcto");
				sc.nextLine();
				bandera=true;
			}
		} while (bandera);

		res=Calculadora.operacion(num1,num2,opc);
		
		System.out.println(res);

		// Cerramos el escaner
		sc.close();

	}

}
