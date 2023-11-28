package ejerciciosfunciones.ejercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int dia, mes, ano;

		System.out.println("Dia: ");
		dia = sc.nextInt();
		System.out.println("Mes: ");
		mes = sc.nextInt();
		System.out.println("Año: ");
		ano = sc.nextInt();

		boolean fecha = Comprueba.fecha(dia, mes, ano);

		if (fecha) {
			System.out.println("La fecha es correcta.");
		} else {
			System.out.println("La fecha es incorrecta.");
		}
		sc.close();

	}

}
