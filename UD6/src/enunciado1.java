import javax.swing.JOptionPane;

public class enunciado1 {

	public static void main(String[] args) {

		String figura=JOptionPane.showInputDialog("¿Qué figura quieres calcular: círculo, triángulo o cuadrado?");
		System.out.print("El area de " +figura+ " es de " +area(figura));
	}

	public static String area(String form) {
		switch (form) {
		case "círculo":
			String circulo=JOptionPane.showInputDialog("Añade el radio:");
			double radio = Double.parseDouble(circulo);
			double areacirculo = Math.pow(radio, 2)*Math.PI;
			form = Double.toString(areacirculo);
			break;
			
		case "triángulo":
			String base=JOptionPane.showInputDialog("Añade la base:");
			double param1 = Double.parseDouble(base);
			String altura=JOptionPane.showInputDialog("Añade la altura:");
			double param2 = Double.parseDouble(altura);
			double areatriangulo = ((param1*param2)/2);
			form = Double.toString(areatriangulo);
			break;
			
		case "cuadrado":
			String lado=JOptionPane.showInputDialog("Añade el lado:");
			double lateral = Double.parseDouble(lado);
			double areacuadrado = ((lateral*lateral)/2);
			form = Double.toString(areacuadrado);
			break;

		default:
			break;
		}	
		return form;
	}
}	
