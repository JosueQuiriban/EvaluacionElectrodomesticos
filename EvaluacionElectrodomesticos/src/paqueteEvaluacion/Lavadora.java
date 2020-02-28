package paqueteEvaluacion;

public class Lavadora extends Electrodomestico {

	// Atributos
	private float carga;
	// Constante
	private final float CARGA = 5;

	// Constructores

	public Lavadora() {
		super();
		this.carga = CARGA;
	}

	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = CARGA;

	}

	public Lavadora(float carga, int precioBase, float peso, String color, String consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;

	}

	// Metodos

	public float getCarga() {
		return carga;
	}

	@Override
	public float precioFinal(float peso, float precio) {
		float precioFinal = super.precioFinal(peso, precio);
		if (carga > 30) {
			precioFinal += 50;
		}
		return precioFinal;

	}

	/*
	 * Lavadora mademza = new Lavadora();
	 * 
	 * @Override public float precioFinal(float peso, float precio) {
	 * super.precioFinal(peso, precio); if (carga > 30) { precioFinal += 50; }
	 * return precioFinal; }
	 */
}
