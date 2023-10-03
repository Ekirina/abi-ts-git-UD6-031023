import javax.swing.JOptionPane;

public class enunciado4 {

	public static void main(String[] args) {
		
		String numero=JOptionPane.showInputDialog("Introduce un número:");
		int num = Integer.parseInt(numero);
		
		System.out.println("El factorial de "+num+" es "+factorial(num));

	}
	
	public static int factorial(int num) {
		int number=num;
		
		for (int i = num-1; 0 < i; i--) {
			number = number*i;
		}
		return number;
		}

	}
	

