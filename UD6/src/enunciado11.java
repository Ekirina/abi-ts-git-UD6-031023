import javax.swing.JOptionPane;

public class enunciado11 {

	public static void main(String[] args) {

		String array1=JOptionPane.showInputDialog("Introduce el tamaño del primer array:");
		int num1[] = new int[Integer.parseInt(array1)];
		int num2[];
		
		String limite1=JOptionPane.showInputDialog("¿Cuál el número mínimo entre los números a escoger en aleatorio?");
		int param1 = Integer.parseInt(limite1);
		String limite2=JOptionPane.showInputDialog("¿Cuál el número máximo entre los números a escoger en aleatorio?");
		int param2 = Integer.parseInt(limite2);
		
		aleatorio(num1,param1,param2);
		num2=num1;
		aleatorio(num1,param1,param2);
		int num3[]=multiplicacion(num1,num2);
		
		System.out.println("Array1");
        mostreo(num1);
 
        System.out.println("Array2");
        mostreo(num2);
 
        System.out.println("Array3");
        mostreo(num3);
		}	

		public static void aleatorio(int i[], int number1, int number2) {	
				for (int j = 0; j < i.length; j++) {
				i[j] = ((int)Math.floor(Math.random()*(number2+1-number1)) + number1);
				}		
		}		

		public static int[] multiplicacion(int array1[], int array2[]) {
			int num3[]=new int [array1.length];
			for(int j=0;j<array1.length;j++){
			     num3[j]=array1[j]*array2[array2.length-(j+1)];
			}
			return num3;
		}
		
		public static void mostreo (int i[]){
			for (int j = 0; j < i.length; j++) {
				System.out.println("En "+j+" se encuentra el valor "+i[j]);
			}
		}	
}	
	


