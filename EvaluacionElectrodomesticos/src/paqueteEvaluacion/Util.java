package paqueteEvaluacion;

/**
 * Clase de utilidad con metodo escribir, arreglo de
 * Letras y Colores.
 * @author josuequiriban
 *
 */
public class Util {

	/**
	 * Metodo que muestra mensaje al usuario.
	 * @param mensaje Mensaje que se muestra al usuario.
	 */
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}

	/**
	 * Arreglo de Letras que se usara en las
	 *  clases heredadas de Electrodomestico.
	 */
	protected static final char Letras[] = { 'A', 'B', 'C', 'D', 'E', 'F' };

	/**
	 * Arreglo de Colores que se usara en las
	 *  clases heredadas de Electrodomestico.
	 */
	protected static final String Colores[] = { "blanco", "negro",
						   "rojo", "azul", "gris" };

	
}
