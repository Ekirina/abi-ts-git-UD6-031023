import javax.swing.JOptionPane;

public class enunciado3 {

	public static void main(String[] args) {

		String numero=JOptionPane.showInputDialog("Introduce un número primo:");
		int num1 = Integer.parseInt(numero);
		
		System.out.println(numeroPrimo(num1));
		
	}	
	public static boolean numeroPrimo(int num){
			
		for (int i=2; i<num; i++) {
			if (num%i==0)
		return false;	
		}
		
		return true;
		}
	
	}



