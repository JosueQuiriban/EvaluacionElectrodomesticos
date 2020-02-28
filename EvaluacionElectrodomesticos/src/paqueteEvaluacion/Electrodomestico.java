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
	private float precioBase;
	private String color;
	private char consumoEnergetico;
	private float peso;

	/**
	 * Constantes con el valor por defecto.
	 */
	private final float PRECIO_BASE = 100000;
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
	public Electrodomestico(float precioBase, float peso) {
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
	public Electrodomestico(int precioBase, float peso, String color, char consumoEnergetico) {
		this(precioBase, peso);
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;

	}

	// Metodos Get

	public float getPrecioBase() {
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

	public String comprobarColor(String color) {
		for (int i = 0; i < Util.Colores.length; i++) {
			if (color != Util.Colores[i]) {
				color = COLOR;
			}

		}
		return color;
	}

	public float precioFinal(float peso, float precio) {
		float precioFinal = 0;
		precioSegunPeso(peso);
		precioSegunConsumo(consumoEnergetico);
		precioFinal = precioSegunPeso(peso) + precioSegunConsumo(consumoEnergetico);
		return precioFinal;
	}

	public float precioSegunPeso(float peso) {
		float aumentaPrecio = 0;
		if (peso > 0 && peso <= 19) {
			aumentaPrecio += 10;
		} else {
			if (peso >= 20 && peso <= 49) {
				aumentaPrecio += 50;
			} else {
				if (peso >= 50 && peso <= 79) {
					aumentaPrecio += 80;
				} else {
					if (peso > 89) {
						aumentaPrecio += 100;
					}
				}
			}
		}
		return aumentaPrecio;
	}

	public float precioSegunConsumo(char consumoEnergetico) {
		float sumaPrecio = 0;
		if (consumoEnergetico == 'A') {
			sumaPrecio = precioBase + 100;
		} else {
			if (consumoEnergetico == 'B') {
				sumaPrecio = precioBase + 80;
			} else {
				if (consumoEnergetico == 'C') {
					sumaPrecio = precioBase + 60;
				} else {
					if (consumoEnergetico == 'D') {
						sumaPrecio = precioBase + 50;
					} else {
						if (consumoEnergetico == 'E') {
							sumaPrecio = precioBase + 30;
						} else {
							if (consumoEnergetico == 'F') {
								sumaPrecio = precioBase + 10;
							}
						}
					}
				}
			}
		}
		return sumaPrecio;
	}
}
