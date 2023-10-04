import java.util.Scanner;

public class enunciado6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		
		int number = sc.nextInt();
		sc.close();
		
		System.out.println(numcadena(number));
	}	
		
	public static int numcadena(int num) {
		if (num>=0) {
			System.out.print("Número de dígitos: ");
			String cadena = Integer.toString(num);
			System.out.println(cadena.length());
			num = Integer.parseInt(cadena);
		}else {
			System.out.print("Error");

		}
		
		return num;
	}
}
