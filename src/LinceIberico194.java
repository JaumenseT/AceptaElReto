import java.util.Scanner;

public class LinceIberico194 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCarreteras = sc.nextInt();
		for (int i = 0; i < numCarreteras; i++) {
			String carretera = sc.next();
			int numTuneles = 0;
			int j = 0;
			while (j < carretera.length()) {
				if (carretera.charAt(j) == '.') {
					numTuneles++;
					j+=3;
				} else {
					j++;
				}
			}
			System.out.println(numTuneles);
		}
		

	}

}
