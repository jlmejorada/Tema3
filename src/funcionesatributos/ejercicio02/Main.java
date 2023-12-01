package funcionesatributos.ejercicio02;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc;
		double alt, anch, res = 0;
		Rectangulo rc;

		anch = pideAncho();
		alt = pideAlto();

		opc = menu();

		rc = new Rectangulo(anch, alt);
		switch (opc) {
		case 1 -> {
			res = rc.perimetro();
		}
		case 2 -> {
			res = rc.area();
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
		System.out.println("1. Perímetro");
		System.out.println("2. Área");
		System.out.println("0. Salir");
		System.out.println("***************");
		System.out.println("Elige una opción");
		num = sc.nextInt();
		return num;
	}

	public static double pideAncho() {
		System.out.println("Dame la anchura de la figura");
		return sc.nextInt();
	}

	public static double pideAlto() {
		System.out.println("Dame la altura de la figura");
		return sc.nextInt();
	}

}
