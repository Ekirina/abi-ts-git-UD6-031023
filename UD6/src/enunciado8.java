import javax.swing.JOptionPane;

public class enunciado8 {

	public static void main(String[] args) {
		int num[]= new int[10];
		relleno(num);
		mostreo(num);
	}
	public static void relleno (int i[]){
		for (int j = 0; j < i.length; j++) {
			String array=JOptionPane.showInputDialog("Introduce un número");
			i[j]=Integer.parseInt(array);
		}
	}
	
	public static void mostreo (int i[]){
		for (int j = 0; j < i.length; j++) {
			System.out.println("En "+j+" se encuentra el valor "+i[j]);
		}
	}
}
