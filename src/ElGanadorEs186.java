import java.util.Scanner;

public class ElGanadorEs186 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numEquipos = sc.nextInt();
		int numGlobos = sc.nextInt();
		while (numEquipos != 0 || numGlobos != 0) {
			int[] puntuaciones = new int[numEquipos];
			for (int i = 0; i < numGlobos; i++) {
				int equipoGanaGlobo = sc.nextInt();
				sc.next();
				puntuaciones[equipoGanaGlobo - 1]++;
			}
			int equipoGanador = 0;
			int maxGlobos = -1;
			boolean empate = true;
			for (int j = 0; j < puntuaciones.length; j++) {
				if (maxGlobos < puntuaciones[j]) {
					maxGlobos = puntuaciones[j];
					equipoGanador = j+1;
					empate = false;
				} else if (maxGlobos == puntuaciones[j]) {
					empate = true;
				}
			}
			if (empate) {
				System.out.println("EMPATE");
			} else {
				System.out.println(equipoGanador);
			}
			numEquipos = sc.nextInt();
			numGlobos = sc.nextInt();
		}
		

	}

}
