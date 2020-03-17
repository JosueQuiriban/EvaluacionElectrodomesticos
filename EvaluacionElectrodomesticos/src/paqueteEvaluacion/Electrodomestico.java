package paqueteEvaluacion;

/**
 * Clase padre de la que heredaran atributos y metodos.
 * 
 * @author josuequiriban
 */
public class Electrodomestico {

	/**
	 * @param precioBase        Es el precio que tendran los objetos que
	 * 							hereden de esta clase.           
	 * @param color             Es el color del objeto electrodomestico.
	 * @param consumoEnergetico Es el valor del consumo energetico que tendra
	 *                          cada uno de los objetos que hereden de esta 
	 *                          clase.
	 * @param peso              Es el peso que tendra por defecto los
	 * 							objetos que hereden de esta clase.               
	 */
	private float precioBase;
	private String color;
	private char consumoEnergetico;
	private float peso;

	/**
	 * Constantes con el valor por defecto.
	 */
	private final float PRECIO_BASE = 100000;
	private final float PESO = 5;
	private final String COLOR = "blanco";
	private final char CONSUMO_ENERGETICO = 'F';

	/**
	 * Constructor por defecto.
	 */
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.peso = PESO;
	    this.color = COLOR;
	    this.consumoEnergetico = CONSUMO_ENERGETICO;
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
		this.precioBase = precioBase;
		this.peso = peso;
	}

	/**
	 * Constructor nos sirve para dar el valor por defecto a los atributos
	 * precioBase, peso, color, consumoEnergetico.
	 * 
	 * @param precioBase        Se da el valor por defecto instanciando el otro
	 *                          constructor.
	 * @param peso              Se da el valor por defecto instanciando el otro
	 *                          constructor.
	 * @param color             Se le da el valor por defecto usando 
	 * 							una constante.
	 * @param consumoEnergetico Se le da el valor por defecto usando una 
	 * 							constante.
	 */
	public Electrodomestico(int precioBase, float peso, 
			String color, char consumoEnergetico) {
		this(precioBase, peso);
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;

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

	/**
	 * Este metodo sirve para comparar el array de letras con el char letra del
	 * objeto creado.
	 * 
	 * @param letra Es la letra del objeto.
	 * @return letra
	 */
	public char comprobarConsumoEnergetico(char letra) {
		for (int i = 0; i < Util.Letras.length; i++) {
			if (letra != Util.Letras[i]) {
				letra = CONSUMO_ENERGETICO;
			}
		}
		return letra;
	}

	/**
	 * Este metodo compara el color del array de colores con el color del
	 * objeto creado.
	 * 
	 * @param color es el color del objeto.
	 * @return color.
	 */
	public String comprobarColor(String color) {
		for (int i = 0; i < Util.Colores.length; i++) {
			if (color != Util.Colores[i]) {
				color = COLOR;
			}

		}
		return color;
	}

	/**
	 * Este metodo entrega el precio final del objeto realizando una
	 * suma del metodo precioSegunPeso y precioSegunConsumo.
	 * 
	 * @param peso   es el peso del objeto.
	 * @param precio es el precio del objeto.
	 * @return precioFinal.
	 */
	
	public float precioFinal(float peso, float precio) {
		float precioFinal = 0;
		precioSegunPeso(getPeso());
		precioSegunConsumo(getConsumoEnergetico());
		precioFinal = precioSegunPeso(getPeso()) + 
				precioSegunConsumo(getConsumoEnergetico());
		return precioFinal;
	}

	/**
	 * Este metodo compara un peso con el peso del objeto
	 * para agregar un valor al precio en el caso que corresponda.
	 * 
	 * @param peso es el peso del objeto
	 * @return aumentaPrecio.
	 */
	public float precioSegunPeso(float peso) {
		float aumentaPrecio = 0;
		if (getPeso() >= 0 && getPeso() <= 19) {
			aumentaPrecio += 10;
		} else {
			if (getPeso() >= 20 && getPeso() <= 49) {
				aumentaPrecio += 50;
			} else {
				if (getPeso() >= 50 && getPeso() <= 79) {
					aumentaPrecio += 80;
				} else {
					if (getPeso() > 89) {
						aumentaPrecio += 100;
					}
				}
			}
		}
		return aumentaPrecio;
	}

	/**
	 * Este metodo compara un char de letra con el del objeto creado
	 * para aumentar el precio segun el caso que corresponda.
	 * 
	 * @param consumoEnergetico
	 * @return
	 */
	public float precioSegunConsumo(char consumoEnergetico) {
		float sumaPrecio = getPrecioBase();
		if (getConsumoEnergetico() == 'A') {
			sumaPrecio += 100;
		} else {
			if (getConsumoEnergetico() == 'B') {
				sumaPrecio += 80;
			} else {
				if (getConsumoEnergetico() == 'C') {
					sumaPrecio += 60;
				} else {
					if (getConsumoEnergetico() == 'D') {
						sumaPrecio += 50;
					} else {
						if (getConsumoEnergetico() == 'E') {
							sumaPrecio += 30;
						} else {
							if (getConsumoEnergetico() == 'F') {
								sumaPrecio += 10;
							}else {
								consumoEnergetico = 'F';
								sumaPrecio += 10;
							}
						}
					}
				}
			}
		}
		return sumaPrecio;
	}
}
