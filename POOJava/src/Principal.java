import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaBancaria cuenta_personal = new CuentaBancaria();
		//cuenta_personal.beneficiario = "Ana Sofía López de Rivera Muñoz";
		
		cuenta_personal.setSaldo(-1200.43f);
		System.out.println(cuenta_personal.getSaldo());
		
		/*
		 * Menú Cajero
		 * 1. Retiro
		 * 2. Depósito
		 * 3. Imprimir Saldo
		 * 4. Estado de cuenta
		 * 5. Agregar beneficiario
		 * 6. Salir
		 */
		
		/*
		int opcion = 0;
		
		do {
			
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Seleccione una opción del menú: ");
		System.out.println("1. Retiro");
		System.out.println("2. Depósito");
		System.out.println("3. Imprimir Saldo");
		System.out.println("4. Estado de cuenta");
		System.out.println("5. Agregar Beneficiario");
		System.out.println("6. Salir");
		
		opcion = leer.nextInt();
		
		
		switch(opcion) {
		
		case 1:
			System.out.println("Ingrese la cantidad que desea retirar:");
			float retiro = leer.nextFloat();
			cuenta_personal.retiros(retiro);
			break;
			
		case 2:
			System.out.println("Ingrese la cantidad que desea depositar:");
			float deposito = leer.nextFloat();
			cuenta_personal.depositos(deposito);
			break;
			
		case 3:
			System.out.println("El saldo actual de su cuenta es de: $" + cuenta_personal.consultarSaldo());
			break;
			
		case 5:
			System.out.println("Ingrese el nombre del beneficiario:");
			String nombre = leer.next();
			cuenta_personal.beneficiario = nombre;
			break;
			
			
		}
		
		} while (opcion != 6);
		
		*/

		
		/*
		 
		System.out.println("Ingrese el monto a depositar");
		
		float deposito = leer.nextFloat();

		System.out.println("Ingrese el monto a retirar");
		float retiro = leer.nextFloat();

		cuenta_personal.depositos(deposito);
		cuenta_personal.retiros(retiro);
		System.out.println("Tu saldo actual es: $" + cuenta_personal.consultarSaldo());

		CuentaBancaria cuenta_papa = new CuentaBancaria();
		cuenta_papa.beneficiario = "Ernesto López de Rivera";

		System.out.println(cuenta_personal.beneficiario);
		System.out.println(cuenta_papa.beneficiario);
		
		*/

	}

}
