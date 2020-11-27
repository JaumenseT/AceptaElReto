import java.util.Scanner;

public class LosSaltosDeMario158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroCasos = sc.nextInt();
		for (int i = 0; i < numeroCasos; i++) {
			int numeroMuros = sc.nextInt();
			int aux = 0;
			int SubeMuro = 0;
			int BajaMuro = 0;
			boolean primerCaso = true;
			for (int j = 0; j < numeroMuros; j++) {
				int muro = sc.nextInt();
				if (!primerCaso) {
					if (muro > aux) {
						SubeMuro++;
					} else if (muro < aux) {
						BajaMuro++;
					}
				}
				primerCaso = false;
				aux = muro;
			}
			System.out.println(SubeMuro + " " + BajaMuro);
		}

	}

}
