package paqueteEvaluacion;

public class Televisor extends Electrodomestico {

	// atributos
	private int resolucion;
	private boolean sintonizadorTDT;

	// Constantes
	private final int RESOLUCION = 20;
	private final boolean SINTONIZADOR_TDT = false;

	// Constructores
	public Televisor() {
		super();
	}

	public Televisor(int precio, int peso) {
		super(precio, peso);
	}

	public Televisor(int resolucion, boolean sintonizadorTDT, int precioBase, float peso, String color,
			String consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
		// TODO Apéndice de constructor generado automáticamente
	}

	// metodos
	public int getResolucion() {
		return resolucion;
	}

	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}

	@Override
	public float precioFinal(float peso, float precio) {
		float precioFinal = super.precioFinal(peso, precio);
		if (resolucion > 40) {
			precioFinal = precioFinal / 100;
			precioFinal = precioFinal * 130;
		}
		if (sintonizadorTDT = true) {
			precioFinal += 50;
		}
		return precioFinal;
	}

}
