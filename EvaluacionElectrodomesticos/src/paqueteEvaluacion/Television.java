package paqueteEvaluacion;

public class Television extends Electrodomestico {
	
	//atributos
	private int resolucion;
	private boolean sintonizadorTDT;
	
	//Constantes
	private final int RESOLUCION = 20;
	private final boolean SINTONIZADOR_TDT = false;
	
	//Constructores
	public Television() {
		super();
	}
	
	
	public Television(int precio, int peso) {
		super(precio, peso);
	}
	
	public Television(int resolucion, boolean sintonizadorTDT, int precioBase, float peso, String color, String consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
		// TODO Apéndice de constructor generado automáticamente
	}

	//metodos
	public int getResolucion() {
		return resolucion;
	}

	
}
