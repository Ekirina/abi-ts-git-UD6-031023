import java.util.Scanner;

public class enunciado5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		
		int number = sc.nextInt();
		
	    System.out.println(binario(number));
		
	}
	
	public static String binario (int numero) {
		
		String num="";
		while (numero > 0) {
			num=(numero%2)+num;
			numero/=2;
		}
		return num;
	}

}
