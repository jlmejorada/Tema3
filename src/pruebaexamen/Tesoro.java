package pruebaexamen;

import java.util.Random;

public class Tesoro {
	// Creamos una constante que almacenará el tamaño de la cuadrícula
	static final int TAM_TABLERO = 10;

	// Creamos dos atributos que se corresponderan con las coordenadas en las que se
	// encuentra el tesoro escondido.
	static int xTesoro;
	static int yTesoro;

	// Creamos dos atributos que se corresponden con las coordenadas en las que se
	// encuentra el jugador.
	int xJugador = 1;
	int yJugador = 1;

	// Entrada: Vacía
	// Salida: Vacía
	// Funcionalidad: Esta función creara dos números aleatorios que se asignaran a
	// la posición del tesoro
	static void generaPosicionTesoro() {
		Random rn = new Random();
		xTesoro = rn.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rn.nextInt(1, TAM_TABLERO + 1);
	}

	// Entrada: Vacía
	// Salida: Vacía
	// Funcionalidad: Pintara el tablero y la posición del jugador con respecto a
	// este
	void pintaTablero() {
		// Creamos un bucle que se repita el número de veces del tamaño de tablero
		for (int i = 1; i <= TAM_TABLERO; i++) {
			// Imprimimos el tab y el numero
			System.out.print("\t" + i);
		}
		// Hacemos un salto de línea
		System.out.println();

		// Creamos un bucle que se repita el número de veces del tamaño de tablero
		for (int i = 1; i <= TAM_TABLERO; i++) {
			// Imprimimos el número
			System.out.print(i);

			// Si la posicion x del jugador es igual que la línea en la que estamos
			if (xJugador == i) {
				// Hacemos un bucle que ponga tantos tab como la yJugador
				for (int j = 1; j <= yJugador; j++) {
					System.out.print("\t");
				}
				// Imprimimos al jugador
				System.out.print("J");
			}

			// Hacemos un salto de línea
			System.out.println();
		}

	}

	// Entrada: Vacía
	// Salida: Vacía
	// Funcionalidad: Devuelve un número entero y recibe como parámetro de entrada
	// una cadena que puede tomar los siguientes valores: “ARRIBA”, “ABAJO”,
	// “DERECHA”, “IZQUIERDA”. Atendiendo al valor de la cadena, el jugador se
	// moverá por la cuadrícula.
	int mueveJugador(String move) {
		// Creamos una variable para el resultado
		int res = 0;

		// Creamos una variable para guardar el String convertido a minuscula
		String moviendo = move.toLowerCase();

		// Creamos un switch que entre en la opción
		switch (moviendo) {
		// Si esta parriba
		case "arriba" -> {
			// Y jugador no esta en la posicion x=1
			if (xJugador > 1) {
				// Se mueve
				xJugador--;
				// Devolvemos 0
				res = 0;
				// Si no, devolvemos -1
			} else
				res = -1;
		}
		// Si esta pabajo
		case "abajo" -> {
			// Y jugador no esta en la posicion x=numeroTablero
			if (xJugador < TAM_TABLERO) {
				// Se mueve
				xJugador++;
				// Devolvemos 0
				res = 0;
				// Si no, devolvemos -1
			} else
				res = -1;
		}
		// Si esta izquierda
		case "izquierda" -> {
			// Y jugador no esta en la posicion y=1
			if (yJugador > 1) {
				// Se mueve
				yJugador--;
				// Devolvemos 0
				res = 0;
				// Si no, devolvemos -1
			} else
				res = -1;
		}
		// Si esta paderecha
		case "derecha" -> {
			// Y jugador no esta en la posicion y=1
			if (yJugador < TAM_TABLERO) {
				// Se mueve
				yJugador++;
				// Devolvemos 0
				res = 0;
				// Si no, devolvemos -1
			} else
				res = -1;
		}
		// SI no a introducido ninguna
		default -> res = -2;
		}
		// Devolvemos el resultado
		return res;
	}

	//// Entrada: Vacía
	// Salida: Vacía
	// Funcionalidad:Devuelve true o false según si el jugador se encuentra en la
	//// misma posición que el tesoro. En caso afirmativo
	//// devolverá true y en caso contrario devolverá false.
	boolean buscaTesoro() {
		// Creamos una variable booleana que se inicialice en false
		boolean devuelvo = false;

		//Miramos si coinciden las cardinalidades
		if (xTesoro==xJugador&&yTesoro==yJugador) {
			devuelvo=true;
		}
		
		// Devolvemos el resultado
		return devuelvo;
	}

}
