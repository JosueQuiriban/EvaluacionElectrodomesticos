package paqueteEvaluacion;

/**
 * Clase padre de la que heredaran atributos y metodos.
 * 
 * @author josuequiriban
 */
public class Electrodomestico {

	/**
	 * @param precioBase        Es el precio que tendran los objetos que hereden de
	 *                          esta clase.
	 * @param color             Es el color del objeto electrodomestico.
	 * @param consumoEnergetico Es el valor del consumo energetico que tendra cada
	 *                          uno de los objetos que hereden de esta clase.
	 * @param peso              Es el peso que tendra por defecto los objetos que
	 *                          hereden de esta clase.
	 */
	private int precioBase;
	private String color;
	private char consumoEnergetico;
	private float peso;

	/**
	 * Constantes con el valor por defecto.
	 */
	private final int PRECIO_BASE = 100000;
	private final String COLOR = "blanco";
	private final char CONSUMO_ENERGETICO = 'F';
	private final float PESO = 5;

	/**
	 * Constructor por defecto.
	 */
	public Electrodomestico() {
		this.precioBase = 0;
		this.color = "";
		this.consumoEnergetico = ' ';
		this.peso = 0;
	}

	/**
	 * Constructor nos sirve para dar el valor por defecto a los atributos
	 * precioBase y peso.
	 * 
	 * @param precioBase Se le da el valor por defecto usando una constante.
	 * @param peso       Se le da el valor por defecto usando una constante.
	 */
	public Electrodomestico(int precioBase, float peso) {
		this();
		this.precioBase = PRECIO_BASE;
		this.peso = PESO;
	}

	/**
	 * Constructor nos sirve para dar el valor por defecto a los atributos
	 * precioBase, peso, color, consumoEnergetico.
	 * 
	 * @param precioBase        Se da el valor por defecto instanciando el otro
	 *                          constructor.
	 * @param peso              Se da el valor por defecto instanciando el otro
	 *                          constructor.
	 * @param color             Se le da el valor por defecto usando una constante.
	 * @param consumoEnergetico Se le da el valor por defecto usando una constante.
	 */
	public Electrodomestico(int precioBase, float peso, String color, String consumoEnergetico) {
		this(precioBase, peso);
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;

	}

	// Metodos Get

	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public float getPeso() {
		return peso;
	}

	// Metodos

	public char comprobarConsumoEnergetico(char letra) {
		for (int i = 0; i < Util.Letras.length; i++) {
			if (letra != Util.Letras[i]) {
				letra = CONSUMO_ENERGETICO;
			}
		}
		return letra;
	}
	/*public char comprobarConsumoEnergetico(char letra) {
		if (letra == 'A') {
			return letra;
		} else {
			if (letra == 'B') {
				return letra;
			} else {
				if (letra == 'C') {
					return letra;
				} else {
					if (letra == 'D') {
						return letra;
					} else {
						if (letra == 'D') {
							return letra;
						} else {
							if (letra == 'E') {
								return letra;
							} else {
								letra = CONSUMO_ENERGETICO;
							}
						}
					}
				}
			}
		}
		return letra;
	}	
	*/
	public String comprobarColor(String color) {
		for (int i = 0; i < Util.Colores.length; i++) {
			if (color != Util.Colores[i]) {
				color = COLOR;
			}
			
		}
		return color;
	}
}
