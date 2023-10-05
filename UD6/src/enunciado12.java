import javax.swing.JOptionPane;

public class enunciado12 {

	public static void main(String[] args) {
		String array1=JOptionPane.showInputDialog("Introduce el tamaño del array:");
		int num1[] = new int[Integer.parseInt(array1)];
		
		int numero = 0;
		do{
		 String digito=JOptionPane.showInputDialog("Introduce el dígito último");
			numero = Integer.parseInt(digito);
		}while (!(numero<=9) && numero>=0);
				
		aleatorio(num1,1,300);
		
		int num2[]= finales(num1,numero);
		mostreo (num2);
	}
	
	public static void aleatorio(int i[], int number1, int number2) {
		for (int j = 0; j < i.length; j++) {
		i[j] = (int)Math.floor(Math.random()*(number2+1-number1)) + number1;			
		}
	}

	
	public static int[] finales (int array[], int digit) {
		int finales[] = new int[array.length];
		int elultimo = 0;
		
		for (int j = 0; j < finales.length; j++) {
			elultimo=array[j]-(array[j]/10*10);
			if(elultimo==digit) {
				finales[j]=array[j];
			}
		}
		return finales;
	}
	
	public static void mostreo (int i[]){
		for (int j = 0; j < i.length; j++) {
			if(i[j]!=0) {
			System.out.println("En "+j+" se encuentra el valor "+i[j]);
			}
		}	
	}
}