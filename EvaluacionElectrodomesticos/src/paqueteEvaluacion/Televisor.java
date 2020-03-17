package paqueteEvaluacion;

/**
 * Clase hija de Electrodomestico que hereda sus metodos y atributos.
 * @author josuequiriban
 *
 */
public class Televisor extends Electrodomestico {

	/**
	 * @param resolucion       Este atributo indica la
	 *  				       resolucion del objeto Televisor.
	 * @param sintonizadorTDT  Este atributo indica si el 
	 * 					       objeto tiene o no sintonizador.
	 * @param RESOLUCION       Esta constante indica el tamaño por defecto
	 * 						   del objeto Televisor.
	 * @param SINTONIZADOR_TDT Esta constante le da el valor por defecto a
	 * 						   sintonizadorTDT.	  
	 */
	private int resolucion;
	private boolean sintonizadorTDT;
	private final int RESOLUCION = 20;
	private final boolean SINTONIZADOR_TDT = false;

	/**
	 * Constructor por defecto que da valores por defecto al objeto 
	 * Televisor.
	 */
	public Televisor() {
		super();
		resolucion = RESOLUCION;
		sintonizadorTDT = SINTONIZADOR_TDT;
	}

	/**
	 * Constructor que da valor por defecto a precio y peso.
	 * @param precio Precio del objeto Televisor.
	 * @param peso Peso del objeto Televisor.
	 */
	public Televisor(int precio, int peso) {
		super(precio, peso);
	}

	/**
	 * Constructor que cambia el valor por defecto de sintonizadorTDT
	 * y de resolucion.
	 * @param resolucion        Resolucion del objeto Televisor.
	 * @param sintonizadorTDT   Atributo que indica si el objeto
	 * 						    tiene sintonizador
	 * @param precioBase        Precio base del objeto. 
	 * @param peso              Peso del objeto Televisor.
	 * @param color             Color del objeto Televisor.
	 * @param consumoEnergetico Indica el consumo del objeto con un char.
	 */
	public Televisor(int resolucion, boolean sintonizadorTDT,
			int precioBase, float peso, String color,
			char consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/**
	 * Metodo Get de Resolucion
	 * @return resolucion.
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * metodo Get de SintonizadorTDT
	 * @return sintonizadorTDT
	 */
	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}

	/**
	 * Metodo que nos entrega el precio final del objeto en base a 
	 * los atributos Resolucion y SintonizadorTDT.
	 */
	@Override
	public float precioFinal(float peso, float precio) {
		float precioFinal = super.precioFinal(peso, precio);
		if (sintonizadorTDT == true) {
			precioFinal += 50;
			}
		if (resolucion > 40) {
			precioFinal *=1.3;
			}
			return precioFinal;
		}
}
