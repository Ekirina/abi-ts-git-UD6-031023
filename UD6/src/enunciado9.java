import java.util.stream.IntStream;

import javax.swing.JOptionPane;

public class enunciado9 {

	public static void main(String[] args) {
			String array=JOptionPane.showInputDialog("Introduce el tamaño del array:");
			int number = Integer.parseInt(array);
			int num[]= new int[number];
			
			relleno(num);
			mostreo(num);
		}
		public static void relleno (int i[]){
			for (int j = 0; j < i.length; j++) {
				int numero = (int)(Math.random()*10+1);
				i[j]= numero;
			}
			int suma = IntStream.of(i).sum();	

			System.out.println("La suma total: "+suma);

		}
		public static void mostreo (int i[]){
			for (int j = 0; j < i.length; j++) {
				System.out.println("En "+j+" se encuentra el valor "+i[j]);
			
			}
	}

}
