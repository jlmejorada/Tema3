package funcionesatributos.ejercicio03;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc;
		double radio, res = 0;
		Circulo cl;

		radio = pideRadio();

		opc = menu();

		cl = new Circulo(radio);
		switch (opc) {
		case 1 -> {
			res = cl.circunferencia();
		}
		case 2 -> {
			res = cl.area();
		}
		case 0 -> {
			System.out.println("Saliendo...");
		}
		}

		System.out.println("El resultado es " + res);

		sc.close();
	}

	public static int menu() {
		int num;
		System.out.println("***************");
		System.out.println("1. Circunferencia");
		System.out.println("2. Área");
		System.out.println("0. Salir");
		System.out.println("***************");
		System.out.println("Elige una opción");
		num = sc.nextInt();
		return num;
	}

	public static double pideRadio() {
		System.out.println("Dame el radio");
		return sc.nextInt();
	}

}
