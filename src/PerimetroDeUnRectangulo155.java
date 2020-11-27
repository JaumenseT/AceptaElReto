import java.util.Scanner;

public class PerimetroDeUnRectangulo155 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lado1 = sc.nextInt();
		int lado2 = sc.nextInt();
		while (lado1 >= 0 && lado2 >= 0) {
			System.out.println(lado1*2 + lado2*2);
			lado1 = sc.nextInt();
			lado2 = sc.nextInt();
		}

	}

}
