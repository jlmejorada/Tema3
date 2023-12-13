package pruebaexamen;

import java.util.Scanner;

public class Main {
//Creamos el escaner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Creamos una variable de la clase tesoro
		Tesoro tesoro;

		// Creamos una variable que recoja el error
		int error = 1;

		// Creamos una variable que recoja la dirección a la que se movera el jugador
		String movimiento = "";

		// Creamos el objeto tesoro
		tesoro = new Tesoro();

		// Llamamos a la función que entierra el tesoro
		Tesoro.generaPosicionTesoro();

		// Mientras el jugador no haya encontrado el tesoro
		while (!tesoro.buscaTesoro()){
			System.out.println("X" + Tesoro.xTesoro);
	        System.out.println("Y" + Tesoro.yTesoro);
			// Llamamos a la función que pinta el tablero
			tesoro.pintaTablero();
			do {
				// Preguntamos al jugador hacia donde se quiere mover
				System.out.println("¿Cual será tu movimiento?");
				movimiento = sc.nextLine();
				// Lamamos a la funcion que realiza el movimiento y recogemos si hay o no fallo
				error = tesoro.mueveJugador(movimiento);
				// Vemos la salida de error
				switch (error) {
				case -1 -> {
					System.out.println("Ese movimiento no está dentro de los límites del tablero");
				}
				case -2 -> {
					System.out.println("Lo siento, pero no entiendo ese movimiento");
				}
				}
			} while (error!=0);
			
		}
		// Llamamos a la función que pinta el tablero
		tesoro.pintaTablero();
		
		// Pasamos un mensaje de victoria
		System.out.println("Oleeee, has encontrado el tesoro!!!");

		// Cerramos el escaner
		sc.close();
	}

}
