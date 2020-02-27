package paqueteEvaluacion;

public class Lavadora extends Electrodomestico {

	//Atributos
	private float carga;
	//Constante
	private final float CARGA = 5;
	//Constructores
	public Lavadora() {	
		super();
		getPrecioBase();
		getColor();
		getConsumoEnergetico();
		getPeso();
	}
	
	public Lavadora(int precioBase, int precio) {
		super();
		
	}
	
	public Lavadora(float carga, int precioBase, float peso, String color,
			String consumoEnergetico) {
		
		super();
		this.carga = CARGA;
		
	}
	
	//Metodos
	
	public float getCarga() {
		return carga;
	}

	public int precioFinal() {
		return 0;
	}
	
}
