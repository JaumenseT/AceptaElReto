import java.util.Scanner;

public class LosProblemasDeSerRico191 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroCasos = sc.nextInt();
		for (int i = 0; i < numeroCasos; i++) {
			int numCompartimentos = sc.nextInt();
			int mayorCompartimento = sc.nextInt();
			int diferenciaCompartimento = sc.nextInt();
			int totalLitros = 0;
			for (int j = 0; j < numCompartimentos; j++) {
				totalLitros = totalLitros + mayorCompartimento;
				mayorCompartimento = mayorCompartimento - diferenciaCompartimento;
			}
			System.out.println(totalLitros);
			
		}

	}

}
