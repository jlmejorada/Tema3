package ampliacion.ejercicio01;

public class Numeros {

	// Creamos el atributo
	int numero;

	// Creamos el constructor
	public Numeros(int numero) {
		super();
		this.numero = numero;
	}

	// Esta función devuelve true si el número es primo y false en caso contrario.
	boolean esPrimo() {
		// Creamos una booleana que actuara de bandera
		boolean bandera = true;
		// Creamos un bucle que recorra todos los números entre 2 (primer número que
		// puede ser no primo) y la raiz del número introducido
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			// Si el modulo de el número original y el que estemos comprobando da 0, no es
			// primo
			if (numero % i == 0) {
				bandera = false;
			}
		}
		// Devolvemos el resultado
		return bandera;

	}

	// Esta función devuelve true si el númeroes capicúa y false en caso contrario.
	boolean esCapicua() {
		// Creamos una booleana que actuara de bandera
		boolean bandera = true;
		// Creamos una variable para tener el número del reves, el último nº y una para
		// operar
		int numReves = 0, ultimoNum, operar;
		// Registramos el número en operar
		operar = numero;
		// Creamos un bucle que recorra los números hasta que el número entero sea 0
		while (operar > 0) {
			// Pillamos la última cifra haciendo el modulo del número
			ultimoNum = operar % 10;
			// Le quitamos una cifra
			operar /= 10;
			// y añadimos el número al número del reves
			numReves = numReves * 10 + ultimoNum;
		}
		// Comprobamos que el número del derecho sea igual que del reves
		if (numero != numReves) {
			bandera = false;
		}
		// Devolvemos el resultado
		return bandera;
	}

}
