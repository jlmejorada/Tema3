package ejerciciosfunciones.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creamos una variable que recoja un número
		int num=0;
		
		//Creamos un escaner
		Scanner sc=new Scanner(System.in);
		
		//Hacemos un bucle que pida números hasta que se le introduzca uno mayor que 0
		do {
			//Comprobamos que se hayan introducido bien los caracteres
			try {
				//Pedimos el números  de veces que queremos que repita el eco y lo recogemos
				System.out.println("Dime cuantas veces se repetira el eco");
				num=sc.nextInt();
			}catch(InputMismatchException e) {
				//Pasamos un mensaje si vemos que no es correcto
				System.out.println("El tipo de caracter introducido no es correcto");
				sc.nextLine();
			}
		} while (num<=0);
		
		//Llamamos a la clase con el parametro num
		Eco.eco(num);
		
		//Cerramos el escaner
		sc.close();

	}

}
