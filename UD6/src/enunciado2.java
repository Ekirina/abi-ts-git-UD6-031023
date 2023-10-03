import javax.swing.JOptionPane;

public class enunciado2 {

	public static void main(String[] args) {
		
		String numaleatorio=JOptionPane.showInputDialog("Cuántos números aleatorios quieres");
		int cuantos	= Integer.parseInt(numaleatorio);
		
		numaleatorio=JOptionPane.showInputDialog("Introduce el mínimo:");
		int numero1 = Integer.parseInt(numaleatorio);
		
		numaleatorio=JOptionPane.showInputDialog("Introduce el máximo:");
		int numero2 = Integer.parseInt(numaleatorio);
		
	
		for(int n=0; n<cuantos; n++) {
		System.out.println(aleatorio(numero1, numero2)+" es un número correcto");
		}
	}	
		
	public static int aleatorio (int num1, int num2) {
		int numero = (int) (Math.floor(Math.random()*(num2-num1)+num1));
		
		return numero;
	}

}
