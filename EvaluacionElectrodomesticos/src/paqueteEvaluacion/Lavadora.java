package paqueteEvaluacion;

/**
 * Esta clase es una clase hija de Electrodomestico.
 * 
 * @author josuequiriban
 *
 */
public class Lavadora extends Electrodomestico {

	/**
	 * @param carga Este atributo es la carga que soporta el objeto.
	 * @param CARGA Este atributo es la constante que dara valor por
	 * 				defecto a carga.
	 */
	private float carga;
	private final float CARGA = 5;

	/**
	 * Constructor por defecto que entrega el valor a carga.
	 */
	public Lavadora() {
		super();
		this.carga = CARGA;
	}

	/**
	 * Constructor que entrega el valor por defecto a precioBase y peso.
	 * @param precioBase Es el valor por defecto del precio.
	 * @param peso Es el peso del objeto.
	 */
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = CARGA;

	}

	/**
	 * Este constructor da el valor por defecto a todos los parametros
	 *  incluidos los heredados de la superclase.
	 * @param carga Es la carga que soporta el objeto Lavadora.
	 * @param precioBase Es el valor por defecto del precio.
	 * @param peso Es el peso del objeto
	 * @param color Es el atributo que le da el color al objeto.
	 * @param consumoEnergetico Es el atributo que define el consumo del objeto
	 */
	public Lavadora(float carga, int precioBase, float peso,
			String color, char consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;

	}

	/**
	 * Metodo que entrega el valor de carga.
	 * @return carga
	 */
	public float getCarga() {
		return carga;
	}

	/**
	 * Metodo que nos dara el precio final del objeto, este es un
	 *  metodo heredado de la super clase Electrodomestico.
	 *  @return precioFinal.
	 */
	@Override
	public float precioFinal(float peso, float precio) {
		float precioFinal = super.precioFinal(peso, precio);
		if (carga > 30) {
			precioFinal += 50;
		}
		return precioFinal;
	}
}
