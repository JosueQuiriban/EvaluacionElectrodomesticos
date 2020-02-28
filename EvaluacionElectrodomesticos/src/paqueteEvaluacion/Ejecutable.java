package paqueteEvaluacion;
import paqueteEvaluacion.Util;
public class Ejecutable {

	public Ejecutable() {
		// TODO Apéndice de constructor generado automáticamente
	}

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Electrodomestico electrodomesticos[] = new Electrodomestico[10];
		electrodomesticos[0] = new Televisor(50, false, 100000, 6, "blanco", 'A');
		electrodomesticos[1] = new Electrodomestico(100000, 50, "gris", 'L');
		electrodomesticos[2] = new Televisor(25, true, 100000, 3, "verde", 'D');
		electrodomesticos[3] = new Lavadora(35, 100000, 8, "blanco", 'A');
		electrodomesticos[4] = new Electrodomestico(100000, 5, "amarillo", 'C');
		electrodomesticos[5] = new Televisor(65, true, 100000, 8, "negro", 'A');
		electrodomesticos[6] = new Lavadora(8, 100000, 4, "azul", 'M');
		electrodomesticos[7] = new Electrodomestico(100000, 2, "rojo", 'B');
		electrodomesticos[8] = new Televisor(29, false, 100000, 4, "negro", 'A');
		electrodomesticos[9] = new Electrodomestico(100000, 244, "cafe", 'F');

		float precioTotal = 0;
		float precioTotalLavadora = 0;
		float precioTotalTelevisor = 0;

		for (int i = 0; i < electrodomesticos.length; i++) {
			precioTotal += electrodomesticos[i].precioFinal(precioTotal, precioTotal);
			if (electrodomesticos[i] instanceof Lavadora) {
				precioTotalLavadora += electrodomesticos[i].precioFinal(precioTotal, precioTotalLavadora);
			} else {
				if (electrodomesticos[i] instanceof Televisor) {
					precioTotalTelevisor += electrodomesticos[i].precioFinal(precioTotal, precioTotalTelevisor);

				}
			}
		}
		Util.escribir("El precio total de todos los televisores es: $" + (int)precioTotalTelevisor);
		Util.escribir("El precio total de todas las lavadoras es: $" + (int)precioTotalLavadora);
		Util.escribir("El precio total por todos los electrodomesticos es de: $" + (int)precioTotal);
	}

}
