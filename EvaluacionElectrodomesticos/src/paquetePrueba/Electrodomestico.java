package paquetePrueba;

public class Electrodomestico {
	
	private int precioBase;
	private String color;
	private String consumoEnergetico;
	private float peso;
	
	private final int PRECIO_BASE = 100000;
	private final String COLOR = "blanco";
	private final String CONSUMO_ENERGETICO = "F";
	private final float PESO = 5;
	
	public Electrodomestico() {
		this.precioBase = 0;
		this.color = "";
		this.consumoEnergetico = "";
		this.peso = 0;
	}
	
	public Electrodomestico(int precioBase, float peso) {
		this();
		this.precioBase = PRECIO_BASE;
		this.peso = PESO;
	}
	
	public Electrodomestico(int precioBase, float peso, String color, String consumoEnergetico ) {
		this(precioBase, peso);
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		
	}

	
}
