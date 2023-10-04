import javax.swing.JOptionPane;

public class enunciado7 {

	public static void main(String[] args) {
		String euro=JOptionPane.showInputDialog("Introduce la cantidad en €:");
		String moneda=JOptionPane.showInputDialog("¿Qué conversión prefiere: yenes, libras o dólares?");
		
		dinero(euro,moneda);

	}
	
	public static void dinero(String eneuro, String coin) {

		switch (coin) {
		case "yenes":
			double yen = Double.parseDouble(eneuro);
			double yenes = (yen*129.852);
			coin = Double.toString(yenes);
			break;
			
		case "libras":
			double lib = Double.parseDouble(eneuro);
			double libras = (lib*0.86);
			coin = Double.toString(libras);
			break;
			
		case "dólares":
			double dollar = Double.parseDouble(eneuro);
			double dolares = (dollar*1.28611);
			coin = Double.toString(dolares);
			break;

		default:
			break;
		}	
		System.out.println("La conversión es en " +coin);
		
	}
}
