package paqueteEvaluacion;
import java.util.Scanner;
public class Util {

	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static String leer(String mensaje) {
		escribir(mensaje);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine();
	}

	protected static final char Letras[] = {
		'A','B','C','D','E','F'
	};
	
	
	protected static final String Colores[] = {
		"blanco", "negro", "rojo", "azul", "gris"
	};
	
	
	
}
