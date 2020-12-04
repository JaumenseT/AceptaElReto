import java.util.Scanner;

public class PanicoEnElTunel209 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String tunel = sc.nextLine();
			int numPersonas = sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < numPersonas; i++) {
				int posicion = sc.nextInt();
				sc.nextLine();
				int distanciaTelPeninsula = 0;
				int distanciaTelIsla = 0;
				int posTelefono = -1;
				boolean personaPeninsula = false;
				boolean personaIsla = false;
				if (tunel.charAt(posicion-1) == 'T') {
					System.out.println("AQUI");
				} else {
					for (int j = 0; j < posicion-1; j++) {
						if (tunel.charAt(j) == 'T') {
							posTelefono = j;
						}
					}
					if (posTelefono == -1) {
						distanciaTelPeninsula = posicion;
						personaPeninsula = true;
					} else {
						distanciaTelPeninsula = (posicion-1) - posTelefono;
					}
					posTelefono = -1;
					for (int j = posicion-1; j < tunel.length(); j++) {
						if (tunel.charAt(j) == 'T') {
							posTelefono = j;
							break;
						}
					}
					if (posTelefono == -1) {
						distanciaTelIsla = (tunel.length() + 1) - posicion;
						personaIsla = true;
					} else {
						distanciaTelIsla = posTelefono - (posicion-1);
					}
					if (distanciaTelPeninsula < distanciaTelIsla) {
						System.out.println("PENINSUNLA");
					} else if (distanciaTelPeninsula > distanciaTelIsla) {
						System.out.println("ISLAS");
					} else {
						if (personaPeninsula) {
							System.out.println("PENINSUNLA");
						} else if (personaIsla) {
							System.out.println("ISLAS");
						} else {
							int distanciaTP = (posicion - 1) - distanciaTelPeninsula;
							int distanciaTI = (tunel.length() - posicion) - distanciaTelIsla;
							if (distanciaTP < distanciaTI) {
								System.out.println("PENINSUNLA");
							} else if (distanciaTI < distanciaTP) {
								System.out.println("ISLAS");
							} else {
								System.out.println("PENINSUNLA");
							}
						}
					}
				}
			}
		}
	}

}
