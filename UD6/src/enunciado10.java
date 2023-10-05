import javax.swing.JOptionPane;

public class enunciado10 {

	public static void main(String[] args) {

		String array=JOptionPane.showInputDialog("Introduce el tamaño del array:");
		int number = Integer.parseInt(array);
		int num[]= new int[number];
		String array1=JOptionPane.showInputDialog("¿Cuál el número mínimo entre los números a escoger en aleatorio?");
		int param1 = Integer.parseInt(array1);
		String array2=JOptionPane.showInputDialog("¿Cuál el número máximo entre los números a escoger en aleatorio?");
		int param2 = Integer.parseInt(array2);
		
		
		aleatorio(num,param1, param2);
		mostrar(num);
		int primomayor = mayor(num);
		System.out.println("El primo mayor es: "+primomayor);
	}
	
	public static void aleatorio(int i[], int number1, int number2) {
		
		int j= 0;
			while(j<i.length) {
			int random = ((int)Math.floor(Math.random()*(number2+1-number1)) + number1);
			if (primo(random)) {
				i[j]= random;
				j++;
			}		
		}		
	}	
	
	public static boolean primo(int num) {
		
		 if (num <= 1) {
		      return false;
		 }else{
		   	
		 int contador = 0;
		 for (int a = (int) Math.sqrt(num); a > 1; a--) {
		     if (num % a == 0) {
		          contador++;
		        }
		    }
		 return contador < 1;
		    }
	}
		
	public static void mostrar(int i[]) {
		  for (int j = 0; j < i.length; j++) {
			
		  String array=Integer.toString(i[j]);
		  System.out.println("En el índice " +j+ " está el valor " + array);	
			}
	}
	
	public static int mayor(int i[]) {
		  int mayor = i[0];
		  for(int j=1;j < i.length; j++) {
			if(i[j]>mayor) {
				mayor = i[j];
			}
		  }
		  return mayor;
	}
	
}	
	