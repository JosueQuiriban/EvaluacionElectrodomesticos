package paqueteEvaluacion;

public class Lavadora extends Electrodomestico {

	//Atributos
	private float carga;
	//Constante
	private final float CARGA = 5;
	
	//Constructores
	
	public Lavadora() {	
		super();
		this.carga = CARGA;
	}
	
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = CARGA;
		
	}
	
	public Lavadora(float carga, int precioBase, float peso, String color,
			String consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
		
	}
	
	//Metodos
	
	public float getCarga() {
		return carga;
	}

	public int precioFinal() {
		return 0;
	}
	
}
