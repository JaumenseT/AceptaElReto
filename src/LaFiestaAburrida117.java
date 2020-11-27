import java.util.Scanner;

public class LaFiestaAburrida117 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		sc.nextLine();
//		for (int i = 0; i < numero; i++) {
//			String nombre = sc.nextLine();
//			nombre = nombre.substring(4);
//			System.out.println("Hola, " + nombre + ".");
//		}
		
		// Código más limpio
		for (int i = 0; i < numero; i++) {
			sc.next();
			String nombre = sc.next();
			System.out.println("Hola, " + nombre + ".");
		}

	}

}
