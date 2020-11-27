import java.util.Scanner;

public class Nochevieja148 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int Dia = 1440;
		
		String aux = sc.nextLine();
		while (!"00:00".equals(aux)) {
			int horas = Integer.parseInt(aux.substring(0, 2))*60;
			int minutos = Integer.parseInt(aux.substring(3));
			int totalMin = horas + minutos;
			System.out.println(Dia - totalMin);
			aux = sc.nextLine();
		}
		
	}
	
}
