import javax.swing.JOptionPane;

public class enunciado2 {

	public static void main(String[] args) {
		
		System.out.println("Introduce entre qué números deseas el límite");
		
		String numaleatorio=JOptionPane.showInputDialog("Introduce el mínimo:");
		int numero1 = Integer.parseInt(numaleatorio);
		
		numaleatorio=JOptionPane.showInputDialog("Introduce el máximo:");
		int numero2 = Integer.parseInt(numaleatorio);
		
		int numero=aleatorio(numero1,numero2);
		
		System.out.println(numero+" es un número correcto");

	}	
		
	public static int aleatorio (int num1, int num2) {
		int numero = (int) (Math.floor(Math.random()*(num2-num1)+num1));
		
		return numero;
	}

}
