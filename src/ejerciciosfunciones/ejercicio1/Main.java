package ejerciciosfunciones.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creamos una variable que recoja un número
		int num=0;
		
		//Creamos un escaner
		Scanner sc=new Scanner(System.in);
		
		//Pedimos el númeroo  de veces que queremos que repita el eco y lo recogemos
		System.out.println("Dime cuantas veces se repetira el eco");
		num=sc.nextInt();
		
		//Llamamos a la clase con el parametro num
		Eco.eco(num);
		
		//Cerramos el escaner
		sc.close();

	}

}
