package main;

import java.util.Scanner;

public class CajeroAutomatico {

	public static void ejecutar() {

		Cuenta cuenta = null;
		Scanner scan = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("Bienvenido! Como lo podemos ayudar?");
			System.out.println("\n\t 1. Crear cuenta vacia");
			System.out.println("\t 2. Crear cuenta con saldo inicial");
			System.out.println("\t 3. Ingresar dinero");
			System.out.println("\t 4. Extraer dinero");
			System.out.println("\t 5. Consultar saldo");
			System.out.println("\t 0. Salir");
			System.out.print("\n\t Ingrese su opcion: ");
			opcion = scan.nextInt();

			switch (opcion) {

			case 1:
				if (cuenta == null) {
					System.out.print("\n\n\t Ingrese su nombre: ");
					String nombre = scan.nextLine();
					System.out.print("\n\t Ingrese su apellido: ");
					String apellido = scan.nextLine();
					System.out.print("\n\t Ingrese su DNI: ");
					int dni = scan.nextInt();
					cuenta = new Cuenta(nombre, apellido, 0, dni);
				} else {
					System.out.println("\nSu cuenta ya se encuentra creada.\n");
				}

				break;

			case 2:
				if (cuenta == null) {
					System.out.print("\n\n\t Ingrese su nombre: ");
					String nombre = scan.nextLine();
					System.out.print("\n\t Ingrese su apellido: ");
					String apellido = scan.nextLine();
					System.out.print("\n\t Ingrese su DNI: ");
					int dni = scan.nextInt();
					System.out.print("\n\t Ingrese el saldo inicial: ");
					float saldo = scan.nextFloat();

					cuenta = new Cuenta(nombre, apellido, saldo, dni);
				} else {
					System.out.println("\nSu cuenta ya se encuentra creada.\n");
				}

				break;

			case 3:
				if (cuenta != null) {
					System.out.print("\n\n\t Ingrese la cantidad de dinero que desea depositar: ");
					float dinero = scan.nextFloat();
					float saldo = cuenta.getSaldo();
					cuenta.setSaldo(saldo + dinero);
				} else {
					System.out.println("\nUsted no tiene cuenta en nuestro banco, debe crear una antes de operar.\n");
				}

				break;

			
			case 4:
				if (cuenta != null) {
					System.out.print("\n\n\t Ingrese la cantidad de dinero que desea extraer: ");
					float dinero = scan.nextFloat();
					float saldo = cuenta.getSaldo();

					if (saldo >= dinero) {
						cuenta.setSaldo(saldo - dinero);
						System.out.println("Operación realizada con éxito.");
					} else {
						System.out.println("\nFondos insuficientes \n");
					}
				} else {
					System.out.println("\nUsted no tiene cuenta en nuestro banco, debe crear una antes de operar.\n");
				}

				break;
				
			case 5:
				if (cuenta != null) {
					System.out.printf("\nEl saldo de su cuenta es: %.2f \n", cuenta.getSaldo());
				} else {
					System.out.println("\nUsted no tiene cuenta en nuestro banco, debe crear una antes de operar.\n");
				}

				break;
				
			default:
				System.out.println("\nOpcion incorrecta. Vuelva a intentarlo\n");

			}
			
			
			
		} while (opcion != 0);

		scan.close();
	}
}