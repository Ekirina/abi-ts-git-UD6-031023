import java.util.Scanner;

public class enunciado6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		
		int number = sc.nextInt();
		sc.close();

		if (number>=0) {
			System.out.print("Número de dígitos: ");
			String cadena = Integer.toString(number);
			System.out.println(cadena.length());
			
		}
		
	}

}
