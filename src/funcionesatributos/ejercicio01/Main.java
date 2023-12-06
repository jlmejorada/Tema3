package funcionesatributos.ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Creamos una variable para recoger la opcion elegida y otras para los números
		int opc;
		double num1, num2;
		
		Operaciones op;
		//Llamamos a la función que mostrara el menú y recogera la opción
		opc=menu();
		//Llamamos a la función que recogera el primer número
		num1=pideNumero();
		//Y el segundo número
		num2=pideNumero();
		//Asignamos los números al operador
		op = new Operaciones(num1,num2);
		//Creamos un switch que mire la opción elegida (a traves de la opción del menú) y llame a la función correcspondiente
		switch (opc) {
		case 1->{
			System.out.println(op.suma());
		}
		case 2->{
			System.out.println(op.resta());
		}
		case 3->{
			System.out.println(op.multiplicacion());
		}
		case 4->{
			System.out.println(op.division());
		}
		case 5->{
			System.out.println(op.numMax());
		}
		case 6->{
			System.out.println(op.numMin());
		}
		default->{
			System.out.println("Saliendo...");
		}
		}
		//Cerramos el escaner
		sc.close();
	}
	
	//Creamos una funcion que nos muestre el Menú y devuelva la opción elegida
	public static int menu() {
		//Creamos la variable opción
		int opc=-1;
		//Iniciamos el escaner
		
		//Mostramos por pantalla el menú
		System.out.println("****************");
		System.out.println("******Menú******");
		System.out.println("****************");
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicación");
		System.out.println("4.División");
		System.out.println("5.Máximo");
		System.out.println("6.Mínimo");
		System.out.println("0.Salir");
		System.out.println("****************");
		//Creamos un bucle que se lance siempre y cuando no se elija una opción correcta
		do {
			try {
				//Y pedimos la opción y la recogemos
				System.out.println("Elige una opción");
				opc=sc.nextInt();
				sc.nextLine();
			} catch(InputMismatchException e) {
				System.out.println("Tipo de valor incorrecto");
				sc.nextLine();
			}
		} while (opc<0||opc>6);
		//Devolvemos la opción
		return opc;
	}
	
	//Creamos la funcion que pedira y recogera el número
	public static double pideNumero(){
		//Creamos las variables necesarias
		double num=-1;
		boolean bandera=true;
		//Creamos un bucle que se lance siempre y cuando no se elija una opción correcta
		do {
			try {
				//Y pedimos la opción y la recogemos
				System.out.println("Dame un número");
				num=sc.nextInt();
				sc.nextLine();
				bandera=false;
				//Comprobamos que sea del tipo correcto
			} catch(InputMismatchException e) {
				System.out.println("Tipo de valor incorrecto");
				sc.nextLine();
			}
		}while(bandera);
		//Devolvemos el número
		return num;
	}

}
